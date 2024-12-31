package Final;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Calculator {
    public int divide(int a, int b) throws NegativeNumberException {
        if (b < 0) {
            throw new NegativeNumberException("Divisor cannot be negative");
        }
        return a / b;
    }
}