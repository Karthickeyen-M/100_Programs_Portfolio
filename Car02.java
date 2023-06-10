
abstract class Vehicle {
    private String brand;


    public Vehicle(String brand) {
        this.brand = brand;
    }

  
    public abstract void start();

   
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}


class Car extends Vehicle {
    // Constructor
    public Car(String brand) {
        super(brand);
    }


    @Override
    public void start() {
        System.out.println("Starting the car engine...");
    }
}


class Bike extends Vehicle {
   
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the bike engine...");
    }



    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Bike bike = new Bike("Honda");

        car.start();
        bike.start();

        car.displayBrand();
        bike.displayBrand();
    }
}
