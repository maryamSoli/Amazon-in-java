package org.example;

public class SmartPhone extends Electronics{

    private String CameraQuality;
    private String StorageCapacity;

    public void setCameraQuality(String cameraQuality) {
        CameraQuality = cameraQuality;
    }

    public String getCameraQuality() {
        return CameraQuality;
    }

    public void setStorageCapacity(String storageCapacity) {
        StorageCapacity = storageCapacity;
    }

    public String getStorageCapacity() {
        return StorageCapacity;
    }

    public void SmartPhone(){

        super.Electronics();

        System.out.println("Please Enter the Camera Quality");
        setCameraQuality(input.nextLine());

        System.out.println("Please Enter the Storage Capacity");
        setStorageCapacity(input.nextLine());
    }
}
