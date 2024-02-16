package Class_Exercise;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface<String, Integer> result = (String a, Integer b) -> {
            System.out.println((Integer.parseInt(a) + b));
        };

        result.Calculate("2", 2);
    }
}
