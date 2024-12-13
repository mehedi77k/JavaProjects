package IInnerClass;

public class LocalInner1 {
    private int data = 30;
    void display(){

        class Local{
            void msg(){
                System.out.println(data);
            }

        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInner1 obj = new LocalInner1();
        obj.display();
    }
}
