package Class_Exercise;

public class TestThread {
    public static void main(String[] args) {
        new ThreadExample("1st");
        new ThreadExample("2st");
        new ThreadExample("3st");

        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            System.out.println("Interrupt!");
        }
        System.out.println("Exiting from main thread.");
    }
}
