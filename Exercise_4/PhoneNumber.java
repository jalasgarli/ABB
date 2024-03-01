import java.util.Scanner;

public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches("^\\\\+994\\\\s(?:50|51|55)\\\\d{7}$\n")) {
            this.phoneNumber = phoneNumber;
            System.out.println("Phone number: " + phoneNumber + " is valid!");
        } else {
            System.out.println("Wrong!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter phone number: ");
            String number = scanner.nextLine();
            PhoneNumber phoneNumber = new PhoneNumber(number);
            phoneNumber.setPhoneNumber(number);
            scanner.close();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}
