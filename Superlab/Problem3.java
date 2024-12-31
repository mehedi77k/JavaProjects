package Superlab;
class Method{
    void display(int num){
        System.out.println(num);
    }
    void display(float num){
        System.out.println(num);
    }
    void display(double num){
        System.out.println(num);
    }
    void display(char num){
        System.out.println(num);
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Method m = new Method();
        m.display(80);
        m.display(15.8);
        m.display(20.6);
        m.display('A');
    }
}
