package Final;
interface Animal{
    public abstract void eat();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog can eat egg");

    }
}
class Cat implements Animal{
    public void eat(){
        System.out.println("Cats are Not stay at home ");
    }
}

public class p_3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
    }
}
