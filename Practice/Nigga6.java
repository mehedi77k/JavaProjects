package Practice;
class Annimal{
    void eat(){
        System.out.println("eating..");
    }
}
class Dogg extends Animal{
    void bark(){
        System.out.println("barking...");
    }
    void eat(){
        System.out.println("eating dickk....");
    }
    void work(){
        super.eat();
        bark();
    }
}

public class Nigga6 {
    public static void main(String[] args) {
        Dogg d = new Dogg();
        d.work();
        d.eat();
        d.bark();
    }

}
