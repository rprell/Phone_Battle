public class Phone {
    int storage;
    int screenSize;
    int price;
    String processor;
    String chargerType;
    String phoneType;

    public Phone() {

    }

    public Phone(String phoneType, int storage, int screenSize, String processor, int price, String chargerType) {
        this.storage = storage;
        this.screenSize = screenSize;
        this.processor = processor;
        this.price = price;
        this.chargerType = chargerType;
        this.phoneType = phoneType;
    }
    void describeSelf() {
        System.out.println("The" + phoneType + " has" + storage + "GB of storage, a screen size of" + screenSize + "in, a" + processor + ", it uses the" + chargerType);
    }
}
