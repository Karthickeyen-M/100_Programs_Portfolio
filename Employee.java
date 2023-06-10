import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
    }

    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and Employee values
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Adding employees to the HashMap
        Employee employee1 = new Employee("John Doe", 30, "Sales");
        employeeMap.put(1, employee1);

        Employee employee2 = new Employee("Alice Smith", 35, "Marketing");
        employeeMap.put(2, employee2);

        // Accessing an employee using a key
        Employee employee = employeeMap.get(1);
        System.out.println("Employee with key 1: " + employee);

        // Iterating over the HashMap entries
        System.out.println("Employees in the HashMap:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            int key = entry.getKey();
            Employee emp = entry.getValue();
            System.out.println("Key: " + key + ", Employee: " + emp);
        }

        // Checking if a key exists in the HashMap
        boolean containsKey = employeeMap.containsKey(2);
        System.out.println("HashMap contains key 2: " + containsKey);

        // Removing an employee from the HashMap
        employeeMap.remove(1);

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + employeeMap.size());
    }
}
