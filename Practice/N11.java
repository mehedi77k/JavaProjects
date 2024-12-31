package Practice;
abstract class Bank{
    abstract int getOfInterest();
}
class PNB extends Bank{
    int getOfInterest(){
        return 7;
    }
}
class UCB extends Bank{
    int getOfInterest(){
        return 9;
    }
}
public class N11 {
    public static void main(String[] args) {
        Bank b = new PNB();
        System.out.println("PNB Bank Interest Is: "+b.getOfInterest()+"%");
        Bank b1 = new UCB();
        System.out.println("UCB Bank Interest Is: "+b1.getOfInterest()+"%");

    }
}
