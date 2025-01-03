package Final;

class Animal{
    String name;
    String sound;
    Animal(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+"is eating");
    }
    void makeSound(){
        System.out.println(name+"Is making Sound");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
        this.sound="Barking";
        System.out.println(name+"Is"+sound);
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
        this.sound="Meowing";
        System.out.println(name+"is telling"+sound);
    }
}

class Bird extends Animal{
    Bird(String name){
        super(name);
        this.sound="Charping";
        System.out.println(name+"is "+sound);
    }
}

public class P_8 {
    public static void main(String[] args) {
        Animal a = new Dog("Tommy");
        a.eat();
        a.makeSound();
        Animal b = new Cat("Bob");
        b.eat();
        b.makeSound();
        Animal c = new Bird("Parrot");
        c.eat();
        c.makeSound();
    }
}
