package LabWork1;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={10,62,77,54,50,69};
        System.out.println("Array 1: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nReversed Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

