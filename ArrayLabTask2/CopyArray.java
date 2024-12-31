package ArrayLabTask2;

public class CopyArray {

    public static void main(String[] args) {
        int [] arr1={1,8,7,5,10,45};
        int [] arr2=new int[arr1.length];//creating another array same length as the first array
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];

        }
        System.out.println("array 2 is : ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);

        }



    }
}
