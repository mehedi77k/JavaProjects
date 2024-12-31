package Final;



class University{
    void  display(){
        System.out.println("Daffodil International University");
    }
}
class College extends University{
    void display(){
        System.out.println("Jhenaidah KC College");
    }
}
public class P_7 {
    public static void main(String[] args) {
        University u = new University();
        u.display();
        University u1 = new College();
        u1.display();
    }
}
