package LabWork1;

public class EvenOdd {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,11,31};
        int odd=0;
        int even=0;
        System.out.println("Elements of array: ");
        for (int j=0; j<a.length;j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\n\nOdd elements: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0) {
                System.out.print(a[i] + " ");
                odd++;
            }
        }
        System.out.println("\nTotal odd elements: "+odd);
        System.out.println("\nEven elements: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) {
                System.out.print(a[i] + " ");
                even++;
            }
        }
        System.out.println("\nTotal even elements: "+even);
    }
}
