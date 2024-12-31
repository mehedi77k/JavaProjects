package Practice;
class Akbar{
    Akbar(){
        System.out.println("A is Constructor");
    }
}
class Bekar extends Akbar{
    Bekar(){
        System.out.println("B is a constructor");
    }
}
class Cute extends Bekar{
    Cute(){
        System.out.println("C is a Constructor");
    }
}

public class N8 {
    public static void main(String[] args) {
        Cute c = new Cute();
    }
}
