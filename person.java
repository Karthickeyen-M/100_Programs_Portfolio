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
        Person person = new Person();

        person.setName("John Doe");
        person.setAge(25);

        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());

        person.setAge(200); // Invalid age

        System.out.println("Updated Person Age: " + person.getAge());
    }
}
