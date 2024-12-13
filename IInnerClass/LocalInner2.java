package IInnerClass;

public class LocalInner2 {
    private int data=30;
    void display(){
        int value=50;
        class Local2{
            void msg(){
                System.out.println(value);
            }

        }
        Local2 l = new Local2();
        l.msg();

    }

    public static void main(String[] args) {
        LocalInner2 obj = new LocalInner2();
        obj.display();
    }
}
