public class Apple extends Phone{

    private String faceTime;
    private String applePay;
    private String faceID;
    private String LiDAR;


    public Apple(String phoneType, int storage, float screenSize, String processor, int price, String chargerType, String faceTime, String applePay, String faceID, String liDAR) {
        super(phoneType, storage, screenSize, processor, price, chargerType);
        this.faceTime = faceTime;
        this.applePay = applePay;
        this.faceID = faceID;
        this.LiDAR = liDAR;
    }

    String getFaceTime() {
        return faceTime;
    }

    void setFaceTime(String faceTime) {
        this.faceTime = faceTime;
    }

    String getApplePay() {
        return applePay;
    }

    void setApplePay(String applePay) {
        this.applePay = applePay;
    }

    String getFaceID() {
        return faceID;
    }

    void setFaceID(String faceID) {
        this.faceID = faceID;
    }

    String getLiDAR() {
        return LiDAR;
    }

    void setLiDAR(String liDAR) {
        LiDAR = liDAR;
    }

    public String toString() {
        return "APPLE: The " + super.getPhoneType() + " has " + super.getStorage() + "GB of storage, a screen size of " + super.getScreenSize() + " inches, a " + super.getProcessor() + " processor, it costs " + super.getPrice() + ", and uses a " + super.getChargerType() + " charger. It is " + faceTime + " that it uses FaceTime. It is " + applePay + " that it uses applepay. It is " + faceID + " that it uses FaceID. It is " + LiDAR + "that it uses LiDAR.";
    }
}
