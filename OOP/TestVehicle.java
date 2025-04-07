import java.util.Scanner;

// Parent/Base Class: Vehicle
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Encapsulation: Getter methods
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Vehicle Details: \nBrand: " + brand + ", \nSpeed: " + speed + " km/h, \nFuel Type: " + fuelType);
    }
}

// Derived Class: Car
class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Derived Class: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "true" : "false"));
    }
}

// TestVehicle Class (Main Method)
public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Car details
        System.out.println("Enter Car details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type [Gas/Diesel]: ");
        String carFuelType = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int carNumDoors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Prompt the user for Motorcycle details
        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int motorcycleSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type [Gas/Diesel]: ");
        String motorcycleFuelType = scanner.nextLine();
        System.out.print("Has Sidecar [true/false]: ");
        boolean hasSidecar = scanner.nextBoolean();


        // Create Car object
        Car car = new Car(carBrand, carSpeed, carFuelType, carNumDoors);
        car.displayInfo();

        // Create Motorcycle object
        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
        motorcycle.displayInfo();

        // Close scanner
        scanner.close();
    }
}
