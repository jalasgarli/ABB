package Exercise_10.Task_2;

import java.util.Scanner;

public class Main {
    public static int getValidNumber() throws InvalidInputException {
        System.out.print("Choose number between 1 and 100: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if(number < 1 || number > 100) {
            throw new InvalidInputException("Number Is Not Valid");
        }
        return number;
    }
    public static void main(String[] args) {
        try {
            int number = getValidNumber();
            System.out.println("Number: " + number);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
