// Abstract class representing a vehicle
abstract class Vehicle {
    private String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method to start the vehicle
    public abstract void start();

    // Concrete method to display the brand of the vehicle
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Car class extending the Vehicle abstract class
class Car extends Vehicle {
    // Constructor
    public Car(String brand) {
        super(brand);
    }

    // Implementing the start method for the Car class
    @Override
    public void start() {
        System.out.println("Starting the car engine...");
    }

    // Car-specific method
    public void specialCarMethod() {
        System.out.println("This is a special method for cars.");
    }
}

// Bike class extending the Vehicle abstract class
class Bike extends Vehicle {
    // Constructor
    public Bike(String brand) {
        super(brand);
    }

    // Implementing the start method for the Bike class
    @Override
    public void start() {
        System.out.println("Starting the bike engine...");
    }

    // Bike-specific method
    public void specialBikeMethod() {
        System.out.println("This is a special method for bikes.");
    }


// Main class

    public static void main(String[] args) {
        // Create objects of Car and Bike classes
        Car car = new Car("Toyota");
        Bike bike = new Bike("Honda");

        // Start the vehicles
        car.start();
        bike.start();

        // Display the brands of the vehicles
        car.displayBrand();
        bike.displayBrand();

        // Create an array of Vehicle objects
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Ford");
        vehicles[1] = new Bike("Yamaha");

        // Polymorphic method calls
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.displayBrand();

            // Check if the vehicle is a Car or Bike
            if (vehicle instanceof Car) {
                Car carVehicle = (Car) vehicle;
                carVehicle.specialCarMethod();
            } else if (vehicle instanceof Bike) {
                Bike bikeVehicle = (Bike) vehicle;
                bikeVehicle.specialBikeMethod();
            }

            System.out.println();
        }

        // Create an anonymous class extending Vehicle
        Vehicle anonymousVehicle = new Vehicle("Anonymous") {
            @Override
            public void start() {
                System.out.println("Starting the anonymous vehicle...");
            }
        };

        anonymousVehicle.start();
        anonymousVehicle.displayBrand();
    }
}
