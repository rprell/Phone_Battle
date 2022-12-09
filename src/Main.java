import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new Apple ("iPhone 13", 128, 6.1f, "Apple A15 Bionic", 1000, "lightning", "true", "true", "true", "true");
        new Samsung ("Galaxy S22", 128, 6.1f, "2.7 GHz octa-core", 599, "wireless", "No", "Yes", 8);

        for(Phone phone: Phone.getPhones()) {
        System.out.println(phone.toString());
        }

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

    }


}