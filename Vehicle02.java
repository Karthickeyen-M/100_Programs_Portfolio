// Parent class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    public void drive() {
        System.out.println("Driving the car with " + numDoors + " doors.");
    }
}

// Child class inheriting from Vehicle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    public void ride() {
        if (hasSidecar) {
            System.out.println("Riding the motorcycle with a sidecar.");
        } else {
            System.out.println("Riding the motorcycle without a sidecar.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.honk();  // Inherited method from Vehicle class
        car.drive();  // Method specific to Car class

        Motorcycle motorcycle = new Motorcycle("Honda", false);
        motorcycle.honk();  // Inherited method from Vehicle class
        motorcycle.ride();  // Method specific to Motorcycle class
    }
}
