package LabTask6;
class SS{
    int sum(int x,int y){
        int a1=x;
        int a2=y;
        return a1+a2;
    }
}
class MM extends SS{
    int multipication(int a,int b){
        int x=a;
        int y=b;
        return x*y;
    }
}
class SSMM extends MM{
    public static void main(String[] args) {
        SSMM s = new SSMM();
        System.out.println("Sum: "+s.sum(100,200));
        System.out.println("Multipication: "+s.multipication(150,260));
    }
}
