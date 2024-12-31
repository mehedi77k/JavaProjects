package Quiz;
class Circle {
    double radius;

    Circle(double x) {
        radius = x;

    }
    double CalculateArea() {
        return 3.1416 * radius * radius;

    }
    double CalculatePerimeter() {
        return 2 * 3.1416 * radius;

    }
}
    class Geometry{
        void PrintCircleDetails(Circle circle){
            System.out.println("Area Of Circle: "+circle.CalculateArea());
            System.out.println("Perimeter Of Circle: "+circle.CalculatePerimeter());
        }
    }

public class Mehedi {
    public static void main(String[] args) {
        Circle c = new Circle(20);
        Geometry g = new Geometry();
        g.PrintCircleDetails(c);
    }
}
