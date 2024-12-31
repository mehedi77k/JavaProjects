package Superlab;
class University{
    String name;
    University(String name){
        this.name=name;
        System.out.println("University Name Is\t= "+name);
    }
}
class College extends University{
    String name;
    College(String name){
        super("Daffodil International University");
        System.out.println("College Name Is\t\t= "+name);
    }
}
public class problem1 {
    public static void main(String[] args) {
        College c = new College("Jhenaidah KC College");

    }
}
