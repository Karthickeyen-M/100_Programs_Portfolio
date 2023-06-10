
class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Dog extends Animal {
    private String breed;


    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

   
    public String getBreed() {
        return breed;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }

   
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}


class Cat extends Animal {
    private String color;

  
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }

   
    public void meow() {
        System.out.println("Meow! Meow!");
    }

    public static void main(String[] args) {
      
        Dog dog = new Dog("Buddy", 5, "Labrador");
        Cat cat = new Cat("Whiskers", 3, "White");

      
        System.out.println("Dog Information:");
        dog.displayInfo();
        dog.bark();
        System.out.println();

       
        System.out.println("Cat Information:");
        cat.displayInfo();
        cat.meow();
    }
}
