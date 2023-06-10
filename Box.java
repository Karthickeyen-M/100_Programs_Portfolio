class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        // Creating a Box of Integer type
        Box<Integer> integerBox = new Box<>(10);
        int intValue = integerBox.getContent();
        System.out.println("Integer value: " + intValue);

        // Creating a Box of String type
        Box<String> stringBox = new Box<>("Hello, Generics!");
        String stringValue = stringBox.getContent();
        System.out.println("String value: " + stringValue);

        // Creating a Box of Double type
        Box<Double> doubleBox = new Box<>(3.14);
        double doubleValue = doubleBox.getContent();
        System.out.println("Double value: " + doubleValue);
    }
}
