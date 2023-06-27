import java.util.Scanner;

class InputPrinter<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public void printTypeAndValue() {
        if (value instanceof Integer) {
            System.out.println("Type: Integer");
        } else if (value instanceof String) {
            System.out.println("Type: String");
        } else {
            System.out.println("Type: Unknown");
        }

        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // Number of test cases

        for (int i = 0; i < T; i++) {
            int c = scanner.nextInt();  // Indicator for type of input

            if (c == 1) {
                String str = scanner.next();
                InputPrinter<String> inputPrinter = new InputPrinter<>();
                inputPrinter.setValue(str);
                inputPrinter.printTypeAndValue();
            } else if (c == 2) {
                int num = scanner.nextInt();
                InputPrinter<Integer> inputPrinter = new InputPrinter<>();
                inputPrinter.setValue(num);
                inputPrinter.printTypeAndValue();
            } else {
                System.out.println("Invalid input");
            }
        }

        scanner.close();
    }
}
