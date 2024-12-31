package Practice;
 abstract class Biker{
    abstract void run();


}
class Cycle extends Biker{
    void run(){
        System.out.println("Running Safely");
    }
}
public class N9 {
    public static void main(String[] args) {
        Biker obj = new Cycle();//Instantiate Cycle instead of Biker
        obj.run();
    }
}
