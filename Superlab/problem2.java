package Superlab;
class Defence{
    void purpose(){
        System.out.println("PROTECT THE COUNTRY");
    }
}
class Navy extends Defence{
    void purpose(){
        System.out.println("PROTECT THE WATER");
    }
}
class AirForce extends Defence{
    void purpose(){
        System.out.println("PROTECT THE SKY ");
    }
}
public class problem2 {
    public static void main(String[] args) {
        Defence d = new Defence();
        d.purpose();
        Defence d1 = new Navy();
        d1.purpose();
        Defence d2 = new AirForce();
        d2.purpose();
    }
}
