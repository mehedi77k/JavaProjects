package Final;
abstract class Shapee{
    abstract void area();
    double d1;
    double d2;

    Shapee(double d1, double d2){
        this.d1= d1;
        this.d2=d2;
    }
}
class Rectanglee extends Shapee{
    Rectanglee(double d3,double d4){
        super(d3,d4);
    }
    void area(){
        double result=0.5*d1*d2;
        System.out.println("Area Of Rectangle is "+result);
    }
}
class Trianglee extends Shapee{
    Trianglee(double d5,double d6){
        super(d5,d6);
    }
    void area(){
        double result=d1*d2;

        System.out.println("Area Of Triangle Is "+result);
    }
}
class Circlee extends Shapee{
    Circlee(int d7){
        super(d7,d7);
    }
    void area(){
        double result= 3.1416*d1*d2;
        System.out.println("The Area Of Circle Is "+result);
    }
}
public class P_1 {
    public static void main(String[] args) {
        Shapee s = new Rectanglee(10,20);
        Shapee s1 = new Trianglee(10,20);
        Shapee s2 = new Circlee(10);
        s.area();
        s1.area();
        s2.area();

    }
}