package LabTask7;
class Defence{
    void Purpose(){
        System.out.println("To Protect The Country");
    }
}
class Navy extends Defence{
    void Purpose(){
        System.out.println("To Protect The Nations Water");
    }
}
class Airforce extends Defence{
    void Purpose(){
        System.out.println("To Defend The Country From Aerial Threats");
    }
}
class Army extends Defence {
    public void Purpose() {
        System.out.println("To Protect The Land Borders");
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Defence navy = new Navy();
        Defence airforce = new Airforce();
        Defence army = new Army();

        navy.Purpose();
        airforce.Purpose();
        army.Purpose();
    }
}
