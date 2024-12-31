package StringLabTask9;

class StringCompare{
    void equalKeyword(){
        String s1="Daffodil";
        String s2="Daffodil";
        String s3="University";
        boolean b=s1.equals(s2);
        System.out.println(b);
    }
    void equalOperator(){
        String s1="Daffodil";
        String s2="Daffodil";
        String s3="University";
        boolean b1=s1==s3;
        System.out.println(b1);

    }
    void CompareTo(){
        String s1="Daffodil";
        String s2="Daffodil";
        String s3="University";
        int i=s1.compareTo(s3);
        if(i>0){
            System.out.println(s1+" word is bigger than "+s3);
        }
        else if(i<0){

            System.out.println(s1+" word is smaller than "+s3);
        }
        else {

            System.out.println(s1+" word is equal than "+s3);
        }
    }
}

public class ComparingString {
    public static void main(String[] args) {
        StringCompare s = new StringCompare();
        s.equalKeyword();
        s.equalOperator();
        s.CompareTo();
    }
}
