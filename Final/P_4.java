package Final;
interface A{
    public abstract void play();
}
interface B{
    void play();

}
class C implements A,B{
    public void play(){                    //public void lekha must naile error
        System.out.println("Hello This is Mehedi");
    }
}
public class P_4 {
    public static void main(String[] args) {
        C c = new C();
        c.play();
    }
}
