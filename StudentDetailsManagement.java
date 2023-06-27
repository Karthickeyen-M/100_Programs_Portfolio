import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDetailsManagement {
    public static void main(String[] args) {
    
        Map<String, String> studentDetails = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

      
        while (true) {
         
            System.out.println("Select an action:");
            System.out.println("1. Add student detail");
            System.out.println("2. Remove student detail");
            System.out.println("3. Update student detail");
            System.out.println("4. View student details");
            System.out.println("5. Exit");

          
            int choice = scanner.nextInt();
            scanner.nextLine(); 

           
            switch (choice) {
                case 1:
                    System.out.print("Enter the student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter the student name: ");
                    String studentName = scanner.nextLine();
                    studentDetails.put(studentId, studentName);
                    System.out.println("Student detail added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the student ID to remove: ");
                    String studentIdToRemove = scanner.nextLine();
                    studentDetails.remove(studentIdToRemove);
                    System.out.println("Student detail removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter the student ID to update: ");
                    String studentIdToUpdate = scanner.nextLine();
                    if (studentDetails.containsKey(studentIdToUpdate)) {
                        System.out.print("Enter the new student name: ");
                        String updatedStudentName = scanner.nextLine();
                        studentDetails.put(studentIdToUpdate, updatedStudentName);
                        System.out.println("Student detail updated successfully.");
                    } else {
                        System.out.println("Student detail not found.");
                    }
                    break;
                case 4:
                    System.out.println("Student Details:");
                    for (Map.Entry<String, String> entry : studentDetails.entrySet()) {
                        String studentIdDetail = entry.getKey();
                        String studentNameDetail = entry.getValue();
                        System.out.println("Student ID: " + studentIdDetail + ", Student Name: " + studentNameDetail);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        
            System.out.println();
            scanner.close();
        }
    }
}
