public class Phone {
    private int storage;
    private int screenSize;
    private int price;
    private String processor;
    private String chargerType;
    private String phoneType;

    public Phone() {
    }

    public Phone(String phoneType, int storage, int screenSize, String processor, int price, String chargerType) {
        this.setStorage(storage);
        this.setScreenSize(screenSize);
        this.setProcessor(processor);
        this.setPrice(price);
        this.setChargerType(chargerType);
        this.setPhoneType(phoneType);
    }

    int getStorage() {
        return storage;
    }

    void setStorage(int storage) {
        this.storage = storage;
    }

    int getScreenSize() {
        return screenSize;
    }

    void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getProcessor() {
        return processor;
    }

    void setProcessor(String processor) {
        this.processor = processor;
    }

    String getChargerType() {
        return chargerType;
    }

    void setChargerType(String chargerType) {
        this.chargerType = chargerType;
        this.phoneType = phoneType;
    }
    void describeSelf() {
        System.out.println("The" + phoneType + " has" + storage + "GB of storage, a screen size of" + screenSize + "in, a" + processor + ", it uses the" + chargerType + "charger, and costs $" + price);
    }
}