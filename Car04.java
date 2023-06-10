
abstract class Vehicle {
    private String model;


    public Vehicle(String model) {
        this.model = model;
    }


    public abstract void start();

    public void displayModel() {
        System.out.println("Model: " + model);
    }


    static class NestedVehicle {
        public void drive() {
            System.out.println("Driving the nested vehicle...");
        }
    }
}

// Car class extending the Vehicle abstract class
class Car extends Vehicle {
    // Constructor
    public Car(String model) {
        super(model);
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
    public Bike(String model) {
        super(model);
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

    public static void main(String[] args) {
        // Create objects of Car and Bike classes
        Car car = new Car("Toyota");
        Bike bike = new Bike("Honda");

        // Start the vehicles
        car.start();
        bike.start();

        // Display the brands of the vehicles
        car.displayModel();
        bike.displayModel();

        // Create an array of Vehicle objects
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Ford");
        vehicles[1] = new Bike("Yamaha");

      
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.displayModel();

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

        // Create an instance of the nested class
        Vehicle.NestedVehicle nestedVehicle = new Vehicle.NestedVehicle();
        nestedVehicle.drive();
    }
}
