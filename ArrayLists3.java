import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists3 {
    public static void main(String[] args) {
        // Create an ArrayList to store objects of a custom class
        ArrayList<Person> persons = new ArrayList<>();

        // Create some Person objects
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("Mike", 40);

        // Add Person objects to the ArrayList
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        // Iterate over the elements using a for-each loop
        System.out.println("Elements in the ArrayList:");
        for (Person person : persons) {
            System.out.println(person);
        }

        // Iterate over the elements using an Iterator
        System.out.println("Elements in the ArrayList using Iterator:");
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
