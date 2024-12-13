package LabTask4;

public class FactorizationOfNumbers {
    public static void main(String[] args) {
        int num = 25;
        System.out.println("Factors of 25 are: ");
        for (int i = 1; i <= 25; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
