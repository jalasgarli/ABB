public class Counter {
    static int instanceCounter;

    public Counter() {
        instanceCounter++;
    }

    public static int getInstanceCount() {
        return instanceCounter;
    }

    public static void main(String[] args) {
        Counter counter3 = new Counter();
        System.out.println(counter3.getInstanceCount());
        
    }
}
