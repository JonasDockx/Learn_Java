public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Shape square = new SquareShape(4);
        Shape circle = new CircleShape(3);
        System.out.println(square.area());
        System.out.println(circle.area());
    }
}

interface Shape {
    double area();
}

class SquareShape implements Shape {
    private double side;

    public SquareShape(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

class CircleShape implements Shape {
    private double radius;
    public CircleShape(double radius) { this.radius = radius; }
    public double area() { return 3.14 * radius * radius; }
}
