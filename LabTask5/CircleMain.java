package LabTask5;

    class Circle {
        double radius;
        double calculateArea(double r) {
            radius = r;
            return 3.1416 * radius * radius;
        }
        double calculatePerimeter(double r) {
            radius = r;
            return 2 * 3.1416 * radius;
        }
    }
    class Geometry {
        void printCircleDetails(Circle circle) {
            double area = circle.calculateArea(circle.radius);
            double perimeter = circle.calculatePerimeter(circle.radius);
            System.out.println("Area: " + area);
            System.out.printf("Perimeter: " + perimeter);
        }
    }

    public class CircleMain {
        public static void main(String[] args) {
            Circle myCircle = new Circle();
            myCircle.radius = 5; // Set the radius
            Geometry geometry = new Geometry();
            geometry.printCircleDetails(myCircle);
        }
    }