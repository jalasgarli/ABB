package Exercise_11;

public class LiveLockExample {
    static class Person {
        private String name;
        private boolean isMovingAside;

        public Person(String name) {
            this.name = name;
            isMovingAside = false;
        }
        
        public String getName() {
            return name;
        }

        public boolean getIsMovingAside() {
            return isMovingAside;
        }

        public synchronized void moveAside(Person other) {
            System.out.println(name + " After " + other.getName());
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            isMovingAside =true;

            if(other.isMovingAside) {
                System.out.println(name + " and " + other.getName() + " are moving same direction");
                isMovingAside = false;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {
        final Person person1 = new Person("Javid");
        final Person person2 = new Person("Nijat");

        Thread thread1 = new Thread(() -> person1.moveAside(person2));
        Thread thread2 = new Thread(() -> person2.moveAside(person1));

        thread1.start();
        thread2.start();
    }
}
