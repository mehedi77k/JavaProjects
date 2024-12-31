package StringLabTask9;

class StringJoin{

    void concat(){
        String s1="Daffodil ";
        String s2="University";

        System.out.println(s1.concat(s2));
    }
    void PlusOperator(){
       String s3="Debudil";
       String s4="Varsity";

        System.out.println(s3+" "+s4);
    }
}
public class Problem {
    public static void main(String[] args) {
        StringJoin s = new StringJoin();
        s.concat();
        s.PlusOperator();
    }
}
