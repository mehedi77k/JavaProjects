package LabTask6;

class Varsity{
    String varsity_name="Daffodil International University";
}
class Colleege extends Varsity{
    String college_name= "Jhenaidah kc college";
    void show(){
        System.out.println("College Name\t= "+college_name);
        System.out.println("University Name = "+varsity_name);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Colleege college = new Colleege();
        college.show();
    }
}
