package Quiz;

class Method {
    void display(int value) {
        System.out.println(value);
    }

    void display(float value) {
        System.out.println(value);
    }

    void display(double value) {
        System.out.println(value);
    }

    void display(char value) {
        System.out.println(value);
    }
}

public class Delulu {
    public static void main(String[] args) {
        Method example = new Method();

        example.display(10);         // Calls display(int)
        example.display(10.5f);      // Calls display(float)
        example.display(20.5);       // Calls display(double)
        example.display('A');        // Calls display(char)
    }
}
