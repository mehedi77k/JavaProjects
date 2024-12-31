package ArrayLabTask2;

public class  ReverseOrder {
    public static void main(String[] args) {
        int ar1[]={4,8,78,96,36,42,420};
        System.out.println("array 1 is : ");
        for(int i=0;i<ar1.length;i++){
            System.out.print(ar1[i]+ " ");
        }
        System.out.println("\nReverse Array is : ");
        for(int i=ar1.length-1;i>=0;i--){
            System.out.print(ar1[i]+ " ");
        }


    }
}
