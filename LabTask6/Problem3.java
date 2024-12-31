package LabTask6;
class Addition{
    int total(){
        int i;
        int summ=0;
        for(i=100;i<=150;i++){
            summ+=i;
        }
        return summ;
    }
}
class Sum extends Addition{
    void show(){

        System.out.println("Additon Is= "+total());
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.show();
    }
}
