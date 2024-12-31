package LabTask6;

class University{
    void display(){
        System.out.println("UNIVERSITY NAME :Daffodil International University");
    }
}
class College extends University{
    void show(){
        System.out.println("COLLEGE NAME \t: Jhenaidah KC College");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        College college = new College();
        college.show();
        college.display();
    }
}
