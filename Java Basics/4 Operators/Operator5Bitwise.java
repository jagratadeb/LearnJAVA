
public class Operator5Bitwise {

    public static void main(String[] args) {
        int x = 5;  // 0101 in binary
        int y = 3;  // 0011 in binary

        System.out.println("Bitwise Operators");

        // AND
        System.out.println("x & y : " + (x & y)); // 1

        // OR
        System.out.println("x | y : " + (x | y)); // 7

        // XOR
        System.out.println("x ^ y : " + (x ^ y)); // 6

        // NOT
        System.out.println("~x : " + (~x)); // -6

        // Left shift
        System.out.println("x << 1 : " + (x << 1)); // 10

        // Right shift
        System.out.println("x >> 1 : " + (x >> 1)); // 2

        // Zero-fill right shift
        System.out.println("x >>> 1 : " + (x >>> 1)); // 2
    }
}
