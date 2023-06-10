
public class Classes {
	String model;
	String color;
	int year;
	
	public Classes(String model,String color,int year ) {
		this.model = model;
		this.color = color;
		this.year = year;	
	}
	public void displayInfo() {
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes car1 = new Classes("Toyoto","Red",2020);
		Classes car2 = new Classes("Mercedes Benz","Blue",2016);
		
		System.out.println("Car 1: ");
		car1.displayInfo();
		
		System.out.println();
		
		System.out.println("Car 2: ");
		car2.displayInfo();
	}

}
