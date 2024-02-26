package Class_Exercise;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        try {
            int index = 5;
            if(index >= array.length) {
                throw new CustomException("Array out of Bounds");
            }
        } catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(arrayIndexOutOfBoundsException);
        } finally {
            System.out.println("Size of array: " + array.length);
        }
    }
}
