package LabTask10;

public class SimpleException {

    void divideByZero() {
        try {
            int i = 15 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Could not execute because: " + e);
        }
    }

    void indexOutOfBounds() {
        int[] array = {12, 45, 36};
        try {
            System.out.println(array[5]); // Accessing out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Could not print index 5 because: " + e);
        }
    }

    void multipleException() {
        try {
            int i = 134 / 0; // Arithmetic exception
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    void finallyBlock() {
        try {
            int j = 316 / 0; // This will throw an exception
        } finally {
            int sum = 0;
            for (int i = 0; i <= 5; i++) {
                sum += i;
            }
            int result = sum / 5; // Safely calculating average
            System.out.println("Result is: " + result);
        }
    }

    public static void main(String[] args) {
        SimpleException e = new SimpleException();
        e.divideByZero();
        e.indexOutOfBounds();
        e.multipleException();
        e.finallyBlock();

        X obj = new X();
        try {
            obj.Y(); // Throws an exception based on logic
        } catch (ArithmeticException ex) {
            System.out.println("Caught exception from Y(): " + ex);
        }

        try {
            obj.Z(); // Throws an exception
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("Caught exception from Z(): " + f);
        }
    }
}

class X {
    void Y() { // Throws exception if condition is met
        int i = 10;
        if (i < 18) {
            throw new ArithmeticException("Exception is Thrown in Y()");
        }
    }

    void Z() throws ArrayIndexOutOfBoundsException { // Updated exception type
        throw new ArrayIndexOutOfBoundsException("Test Exception in Z()");
    }
}
  