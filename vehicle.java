
abstract class Vehicle {
    private String brand;


    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();

  
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

   
    static class NestedVehicle {
        public void drive() {
            System.out.println("Driving the nested vehicle...");
        }
    }
}


class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine...");
    }

   
    public void specialCarMethod() {
        System.out.println("This is a special method for cars.");
    }
}


class Bike extends Vehicle {
    // Constructor
    public Bike(String brand) {
        super(brand);
    }

   
    @Override
    public void start() {
        System.out.println("Starting the bike engine...");
    }

    public void specialBikeMethod() {
        System.out.println("This is a special method for bikes.");
    }

    public static void main(String[] args) {
     
        Car car = new Car("Toyota");
        Bike bike = new Bike("Honda");

      
        car.start();
        bike.start();

     
        car.displayBrand();
        bike.displayBrand();

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Ford");
        vehicles[1] = new Bike("Yamaha");

   
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.displayBrand();

        
            if (vehicle instanceof Car) {
                Car carVehicle = (Car) vehicle;
                carVehicle.specialCarMethod();
            } else if (vehicle instanceof Bike) {
                Bike bikeVehicle = (Bike) vehicle;
                bikeVehicle.specialBikeMethod();
            }

            System.out.println();
        }

       
        Vehicle.NestedVehicle nestedVehicle = new Vehicle.NestedVehicle();
        nestedVehicle.drive();

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
