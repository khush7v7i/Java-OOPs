// DeviceSmartPhone.java

// Parent class
class Device {

    // Data members
    String brand;
    String model;

    // Protected member
    protected int batteryLevel;

    // Constructor
    Device(String brand, String model, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    // Method of parent class
    void displayDeviceInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}

// Child class inheriting Device
class SmartPhone extends Device {

    // Data member of SmartPhone
    String operatingSystem;

    // Constructor
    SmartPhone(String brand, String model, int batteryLevel, String operatingSystem) {
        super(brand, model, batteryLevel);
        this.operatingSystem = operatingSystem;
    }

    // Method of child class
    void displaySmartPhoneInfo() {

        // Inherited data members
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);

        // Accessing protected member from subclass
        System.out.println("Battery Level: " + batteryLevel + "%");

        System.out.println("Operating System: " + operatingSystem);
    }
}

// Main class
public class DeviceSmartPhone {

    public static void main(String[] args) {

        // Creating SmartPhone object
        SmartPhone phone = new SmartPhone(
                "Samsung",
                "Galaxy S24",
                85,
                "Android");

        System.out.println("=== Device Information ===");
        phone.displayDeviceInfo();

        System.out.println();

        System.out.println("=== Smartphone Information ===");
        phone.displaySmartPhoneInfo();
    }
}