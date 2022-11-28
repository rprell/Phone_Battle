public class Samsung extends Phone{
    private String externalMemory;

    private String fingerPrint;

    private int ram;

    public Samsung(){

    }

    public Samsung(String phoneType, int storage, int screenSize, String processor, int price, String chargerType, String externalMemory, String fingerPrint, int ram) {
        super(phoneType, storage, screenSize, processor, price, chargerType);
        this.setExternalMemory(externalMemory);
        this.setFingerPrint(fingerPrint);
        this.setRam(ram);
    }


    String getExternalMemory() {
        return externalMemory;
    }

    void setExternalMemory(String externalMemory) {
        this.externalMemory = externalMemory;
    }

    String getFingerPrint() {
        return fingerPrint;
    }

    void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    int getRam() {
        return ram;
    }

    void setRam(int ram) {
        this.ram = ram;
    }
}
