package LabWork1;

public class ArrayAverage {
    public static void main(String[] args) {
        int arr[]={4,5,8,13,12};
        int sum=0;
        double avg;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];//sum=sum+arr[]
        }
        avg=(float)sum/arr.length;
        System.out.println("Average of elements: "+avg);
    }
}