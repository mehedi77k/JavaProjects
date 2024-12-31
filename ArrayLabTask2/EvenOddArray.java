package ArrayLabTask2;

public class EvenOddArray {
        public static void main(String[] args) {

            int[] array = {10, 25, 37, 68, 27, 46, 59, 13, 29};

            System.out.println("Even numbers : ");

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");
                }
            }

            System.out.println("\nOdd numbers : ");

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }

