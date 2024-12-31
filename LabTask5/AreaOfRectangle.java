package LabTask5;

class Area{
    double length;
    double breadth;

    Area(double l, double b){
        length=l;
        breadth=b;
    }
    double returnArea(){
        double result =length*breadth;
        return result;

    }
}
public class AreaOfRectangle {
    public static void main(String[] args) {
        Area a1=new Area(37,48);
        double result=a1.returnArea();
        System.out.println("Area of the Rectangle: "+result);
    }
}
