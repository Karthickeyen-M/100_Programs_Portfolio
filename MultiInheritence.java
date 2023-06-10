import java.util.*;

public class MultiInheritence {
     int rollNumber;

     MultiInheritence(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

class Test extends MultiInheritence {
    double[] marks;

    public Test(int rollNumber, double[] marks) {
        super(rollNumber);
        this.marks = marks;
    }
}

class Result extends Test {
    public Result(int rollNumber, double[] marks) {
        super(rollNumber, marks);
    }

    public void display() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;

        System.out.println(rollNumber + " " + total + " " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();  // Number of test cases

        for (int i = 0; i < testCases; i++) {
            int rollNumber = scanner.nextInt();  // Roll number of the student

            double[] marks = new double[5];  // Array to store the marks
            for (int j = 0; j < 5; j++) {
                marks[j] = scanner.nextDouble();
            }

            Result result = new Result(rollNumber, marks);
            result.display();
        }

        scanner.close();
    }
}
