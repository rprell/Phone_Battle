import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Apple.readAppleData();

        for (Phone phone : Phone.getPhones()) {
            System.out.println(phone.toString());
        }

        Samsung.readSamsungData();
        {

        }
    }
}