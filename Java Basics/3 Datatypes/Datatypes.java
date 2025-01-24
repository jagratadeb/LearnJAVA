
public class Datatypes {

    public static void main(String[] args) {

        // Integer variable (4 bytes), range: -2^31 to 2^31-1
        int a = 50;
        System.out.println("Integer a: " + a);

        // Float variable (4 bytes), example: 5.75
        float b = 5.75f;
        System.out.println("Float b: " + b);

        // Double variable (8 bytes), example: 19.99
        double c = 19.99;
        System.out.println("Double c: " + c);

        // Character variable (2 bytes), represents a single 16-bit Unicode character
        char d = 'D';
        System.out.println("Character d: " + d);

        // Boolean variable (1 bit), values: true or false
        boolean e = true;
        System.out.println("Boolean e: " + e);

        // String variable with a name starting with $ sign, represents a sequence of characters
        String $ok = "how to be happy?";
        System.out.println("String $ok: " + $ok);

        // Byte variable (1 byte), range: -128 to 127
        byte f = 10;
        System.out.println("Byte f: " + f);

        // Short variable (2 bytes), range: -32,768 to 32,767
        short g = 1000;
        System.out.println("Short g: " + g);

        // Long variable (8 bytes), range: -2^63 to 2^63-1
        long h = 15000000000L;
        System.out.println("Long h: " + h);

        // Array of integers
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array element at index 0: " + arr[0]);

        // Object of a custom class
        MyClass myObject = new MyClass();
        myObject.showMessage();
    }
}

class MyClass {

    // Method to display a message
    void showMessage() {
        System.out.println("Hello from MyClass!");
    }
}
