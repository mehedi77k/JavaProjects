package Final;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.1416 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.1416 * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width); // Corrected the formula for perimeter.
    }
}

class Triangle implements Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}

public class P_9 {
    public static void main(String[] args) {
        Shape c = new Circle(5);          // Circle instance.
        Shape r = new Rectangle(20, 25);  // Rectangle instance.
        Shape t = new Triangle(25, 26, 27); // Triangle instance.

        // Calling instance methods through objects to compute and display results.
        System.out.println("Circle: Area = " + c.area() + ", Perimeter = " + c.perimeter());
        System.out.println("Rectangle: Area = " + r.area() + ", Perimeter = " + r.perimeter());
        System.out.println("Triangle: Area = " + t.area() + ", Perimeter = " + t.perimeter());
    }
}
