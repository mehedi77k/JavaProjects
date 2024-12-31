package Practice;

class Aaa {
    protected void msg() {
        System.out.println("Hello World");
    }
}

class Baa extends Aaa {
    @Override
    protected void msg() {  // keep access level protected
        System.out.println("Hello World");
    }
}

public class Niggs5 {
    public static void main(String[] args) {
        Baa b = new Baa();
        b.msg();
    }
}
