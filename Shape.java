import java.util.Scanner;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Drawing a " + name);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length " + length + " and width " + width);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with base " + base + " and height " + height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numShapes = scanner.nextInt();
        scanner.nextLine();

        Shape[] shapes = new Shape[numShapes];

        for (int i = 0; i < numShapes; i++) {
            System.out.println("\nShape #" + (i + 1));
            System.out.print("Enter the shape name: ");
            String shapeName = scanner.nextLine();

            System.out.print("Enter the shape type (1 - Circle, 2 - Rectangle, 3 - Triangle): ");
            int shapeType = scanner.nextInt();
            scanner.nextLine();

            switch (shapeType) {
                case 1:
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    shapes[i] = new Circle(shapeName, radius);
                    break;
                case 2:
                    System.out.print("Enter the length: ");
                    double length = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the width: ");
                    double width = scanner.nextDouble();
                    scanner.nextLine();
                    shapes[i] = new Rectangle(shapeName, length, width);
                    break;
                case 3:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the height: ");
                    double height = scanner.nextDouble();
                    scanner.nextLine();
                    shapes[i] = new Triangle(shapeName, base, height);
                    break;
                default:
                    System.out.println("Invalid shape type. Skipping shape.");
                    break;
            }
        }

        System.out.println("\nDrawing shapes:");
        for (Shape shape : shapes) {
            shape.draw();
        }

        scanner.close();
    }
}
