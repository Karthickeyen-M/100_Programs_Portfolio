
class Car {
   
    private String brand;
    private String color;
    private int year;

  
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

 
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }


    public static void main(String[] args) {
     
        Car car1 = new Car("Toyota", "Red", 2020);
        Car car2 = new Car("Honda", "Blue", 2018);

     
        System.out.println("Car 1:");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Year: " + car1.getYear());

        System.out.println();

        System.out.println("Car 2:");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Year: " + car2.getYear());

        System.out.println();

        // Update car information using setter methods
        car1.setBrand("Ford");
        car1.setColor("Silver");
        car1.setYear(2019);

       
        System.out.println("Updated Car 1:");
        car1.displayInfo();
    }
}
