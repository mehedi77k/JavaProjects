package LabTask7;

 class University { //1no
    String name;
    University(String name){
        this.name=name;
        System.out.println(name);
    }
}
class College extends University{
    public static void main(String[] args) {
        University u=new University("Daffodil International University");
        College c=new College("Jhenaidah KC College");
    }

    College(String name) {

        super(name);
    }
}