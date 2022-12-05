public class Apple extends Phone{

    private String faceTime;
    private String applePay;
    private String faceID;
    private String LiDAR;


    public Apple(String phoneType, int storage, float screenSize, String processor, int price, String chargerType, String faceTime, String applePay, String faceID, String Lidar) {
        super(phoneType, storage, screenSize, processor, price, chargerType);

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

    void describeSelf() {
    }
}
