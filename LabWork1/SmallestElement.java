package LabWork1;

public class SmallestElement {

    public static void main(String[] args) {
        int [] arr={12,54,68,75};
        int min=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest element is: "+min);
    }
}
