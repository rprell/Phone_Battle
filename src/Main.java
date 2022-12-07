import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        new Apple ("iPhone 13", 128, 6.1f, "Apple A15 Bionic", 1000, "lightning", "true", "true", "true", "true");
        new Samsung ("Galaxy S22", 128, 6.1f, "2.7 GHz octa-core", 599, "wireless", "No", "Yes", 8);

        for(Phone phone: Phone.getPhones()) {
        System.out.println(phone.toString());
        }
    }


}