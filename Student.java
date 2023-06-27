import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        
        studentList.add(new Student(1, "John Doe", 20));
        studentList.add(new Student(2, "Alice Smith", 22));
        studentList.add(new Student(3, "Bob Johnson", 21));

        Student student = studentList.get(0);
        System.out.println("Student at index 0: " + student);

        
        System.out.println("Students in the ArrayList:");
        for (Student s : studentList) {
            System.out.println(s);
        }

      
        boolean containsStudent = studentList.contains(new Student(2, "Alice Smith", 22));
        System.out.println("ArrayList contains Alice Smith: " + containsStudent);

      
        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        studentList.remove(1);

   
        System.out.println("Size of the ArrayList: " + studentList.size());

        System.out.println("Students in the ArrayList (using Iterator):");
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
