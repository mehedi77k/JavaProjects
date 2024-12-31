package LabTask6;

class S{
    int sum(int x,int y){
        return x*y;
    }
}
class M extends S{
    int multipication(int a,int b){
        return a*b;
    }
}
class SM extends M {

    void display() {
        int x=5;
        int y=6;
        int a=7;
        int b=8;
        System.out.println("Total Sum Is= "+sum(x,y));
        System.out.println("Multipication Is= "+multipication(a,b));

    }
}
public class Problem4 {
    public static void main(String[] args) {
        SM s = new SM();
        s.display();
    }
}

