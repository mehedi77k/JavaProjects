package LabTask10;
interface Employee{
    int id=15081975;
    String name="Dalim";
    int age=65;
    int salary=100000;

}
class PermanentEmployee implements Employee{
    public void salary(){
        System.out.println("Name: "+name+ "\nID: "+id+ "\nAge: "+age+ "\nSalary: "+salary);
    }
}
public class Interface {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        p.salary();
    }
}