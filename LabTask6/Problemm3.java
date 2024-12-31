package LabTask6;
class Addiition {
    void display(){
        int i=100;
        int total=0;
        for(i=100;i<=150;i++){
            total+=i;
        }
        System.out.println("Addition Is= "+total);
    }
}

class Summ extends Addiition {
    public static void main(String[] args) {

        Summ u = new Summ();
        u.display();
    }
}

