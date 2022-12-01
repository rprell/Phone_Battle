import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Phone> phones = new ArrayList<>();
        Phone iphone = new Phone("iPhone 13", 128, 6.1f, "Apple A15 Bionic", 1000, "lightning");
        Phone samsung = new Phone("Galaxy S22", 128, 6.1f, "2.7 GHz octa-core", 599, "wireless");

        iphone.describeSelf();
        samsung.describeSelf();

        for(Phone phone: phones) {
            phone.describeSelf();
        }
    }


}