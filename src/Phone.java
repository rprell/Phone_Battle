public class Phone {
    private int storage;
    private float screenSize;
    private int price;
    private String processor;
    private String chargerType;
    private String phoneType;

    public Phone() {
    }


    public Phone(String phoneType, int storage, float screenSize, String processor, int price, String chargerType) {
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

    float getScreenSize() {
        return screenSize;
    }

    void setScreenSize(float screenSize) {
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
    String getPhoneType() {
        return phoneType;
    }

    void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
    void describeSelf() {
        System.out.println("The " + phoneType + " has " + storage + "GB of storage, a screen size of " + screenSize + " inches, a " + processor + " processor, it uses the " + chargerType + "charger, and costs $" + price);
    }
}