interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
