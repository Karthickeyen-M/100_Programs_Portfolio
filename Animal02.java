
public class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
	public void sleep() {
		System.out.println(name +" is sleeping");
	}
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
    public void bark() {
    	System.out.println("Woof! Woof!");
    }
}
class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void meow() {
		System.out.println("Meow! Meow!");
	}
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
		dog.eat();
		dog.sleep();
		dog.bark();
		
		System.out.println("");
		
		Cat cat = new Cat("Whiskers");
		cat.eat();
		cat.sleep();
		cat.meow();

	}

}
