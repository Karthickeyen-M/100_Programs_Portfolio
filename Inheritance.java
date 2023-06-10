class cls1 {
    void add(int p, int q) {
        System.out.println(p + q);
    }
}

class cls2 extends cls1 {
    void mul(int p, int q) {
        System.out.println(p * q);
    }

    void task(int a, int b) {
        int sumOfSquares = (a * a) + (b * b);
        System.out.println("Sum of squares: " + sumOfSquares);
    }

    public static void main(String[] args) {
        cls2 obj = new cls2();
        obj.add(3, 4);  // Inherited method from cls1
        obj.mul(3, 4);  // Method specific to cls2
        obj.task(3, 4);  // New method added in cls2
    }
}
