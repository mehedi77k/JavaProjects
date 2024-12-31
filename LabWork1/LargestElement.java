package LabWork1;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr={10,62,77,70,82};
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Largest element is: "+max);
    }
}
