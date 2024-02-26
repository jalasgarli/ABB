package Exercise_10.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Number: ");
                int number = scanner.nextInt();
                int square = number * number;
                System.out.println("Square of " + number + " is " + square);
                break;
            } catch(Exception exception) {
                System.out.println("Invalid number!");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}

