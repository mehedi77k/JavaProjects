package LabTask7;


class OverloadPolymorphism{
    void display(int value){
        System.out.println(value);
    }
    void display(double value){
        System.out.println(value);
    }
    void display(float value){
        System.out.println(value);
    }
    void display(char value){
        System.out.println(value);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        OverloadPolymorphism c = new OverloadPolymorphism();
        c.display(110);
        c.display(11.5f);
        c.display(11.2);
        c.display('H');

    }
}
