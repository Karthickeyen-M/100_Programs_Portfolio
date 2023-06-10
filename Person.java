import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age should be between 0 and 150.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        person.setAge(age);

        System.out.println("\nPerson Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        scanner.close();
    }
}
