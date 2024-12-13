package IInnerClass;

class TestMember1{
    private int data = 30;
    class Inner{
        void msg(){
            System.out.println("Data is: "+data);
        }

    }
}

public class MemberInner {
    public static void main(String[] args) {
        TestMember1 obj = new TestMember1();
        TestMember1.Inner in = obj.new Inner();
        in.msg();
    }
}
