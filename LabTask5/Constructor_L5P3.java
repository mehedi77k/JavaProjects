package LabTask5;

class Employee{
    int id;
    String name;
    Employee(int i, String n){    //constractor declare
        id=i;
        name=n;
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}
public class Constructor_L5P3 {
    public static void main(String[] args) {
        Employee obj1=new Employee(01, "Mehedi");
        Employee obj2=new Employee(20, "Hasan");
        obj1.display();
        obj2.display();
    }
}
