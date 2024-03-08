package Class_Exercise;

class ThreadExample implements Runnable {
    String name;
    Thread thread;
    ThreadExample(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("A new thread: " + thread + " is created.");
        thread.start();
    }
    public void run() {
        try {
            for(int j=5; j>0; j--) {
                System.out.println(name + ": " + j);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "thread exiting.");
    }
}
