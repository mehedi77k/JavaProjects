package Final;
abstract class Shape{
    abstract void calculateArea();

}
class Circle extends Shape{
    void calculateArea(){
        int r=10;
        double result= 3.1416*r*r;
        System.out.println("Total Area Of Circle = "+result);
    }
}
class Rectangle extends Shape{
    void calculateArea(){
        int d=10;
        int d2=20;
        double result= 0.5*d*d2;
        System.out.println("Total Area Of Rectangle Is= "+result);
    }
}
public class P_5 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea();
        Shape shape1 = new Rectangle();
        shape1.calculateArea();
    }
}
