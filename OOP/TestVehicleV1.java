//Raquiren Mendoza
//INF 243
//March 31, 2025

import java.util.Scanner;
//parent/base class: Vehicle
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    //Constructor
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Encapsulation: Getter and Setter methods
    public String getbrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public double getSpeed() {
        return speed;
    }

    public String getfuelType() {
        return fuelType;
    }
    
    // Method to print vehicle details
    public void displayInfo() {
            System.out.println("Vehicle details: Brand - " + brand + ", Speed - " + speed + " km/h, Fuel Type - " + fuelType); 
        }
    }

//Derived class: Car
class Car extends Vehicle {
    private int numDoors;


    // Constructor
    public Car(String brand, int speed, String fuelType) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;

}

    // Overriding 
    @Override
    public void displayInfo() {

    }
}

//Derived class: Motorcycle
class Motorcycle extends Vehicle {
    private boolean  hasSidecar;

    // Constructor
    public Motorcycle(String brand, int speed, String fuelType) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
}

    // Overriding withdraw method
    @Override
    public void displayInfo() {

    }

   
}

//6. Implement the testVehicle Class (Main Method)
class TestVehicleV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Car details
        System.out.println("Enter Car details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        String carFuelType = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int carNumDoors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create Car object
        Car car = new Car(carBrand, carSpeed, carFuelType);
        car.displayInfo();

        // Prompt user for Motorcycle details
        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int motorcycleSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        String motorcycleFuelType = scanner.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        // Create Motorcycle object
        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType);
        motorcycle.displayInfo();

        // klows iskaner
        scanner.close();
    }
}




