package StringLabTask9;



class Index{
    void  ParticulerIndex(){
        String s="MEHEDI";
        System.out.println("In String "+s+" Character at 3 index is : "+s.charAt(3));
    }
    void FindIndex(){
        String s="helloworld";
        System.out.println("In String "+s+" The 'e' Index at: "+s.indexOf('e'));
    }
    void FindIndext2() {
        String s = "helloworld";
        int startIndex = 2;
        System.out.println("In String \"" + s + "\", the first 'e' after index " + startIndex + " is at index: " + s.indexOf('e', startIndex));
    }
    void IndexOfSubstring(){
        String s="HelloPmec";
        System.out.println("In String "+s+" Substring 'loP' at index : "+s.indexOf("loP",5)
                +" If index starts from 5 ");
    }

}
public class StringIndex {
    public static void main(String[] args) {
        Index c= new Index();
        c.ParticulerIndex();
        c.FindIndex();
        c.FindIndext2();
        c.IndexOfSubstring();
    }
}
