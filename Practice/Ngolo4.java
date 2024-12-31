package Practice;
class Bike{
    void run(){
        System.out.println("Bike is Running");
    }
}
class Bike2 extends Bike{
    void run(){
        System.out.println("Bike Is Running");
    }
}
public class Ngolo4 {
    public static void main(String[] args) {
        Bike2 b = new Bike2();
        b.run();

    }
}
