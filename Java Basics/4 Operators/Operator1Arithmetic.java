public class Operator1Arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println("Arithmetic Operators");

        // Addition
        System.out.println("a + b = " + (a + b)); // 10

        // Subtraction
        System.out.println("a - b = " + (a - b)); // 0

        // Division
        System.out.println("a / b = " + (a / b)); // 1

        // Multiplication
        System.out.println("a * b = " + (a * b)); // 25

        // Exponentiation (Java does not have an exponentiation operator, use Math.pow)
        System.out.println("a ^ b = " + (int)Math.pow(a, b)); // 3125

        // Modulus
        System.out.println("a % b = " + (a % b)); // 0

        // Post-increment
        System.out.println("a++ = " + (a++)); // 5
        System.out.println("After a++: a = " + a); // 6

        // Post-decrement
        System.out.println("a-- = " + (a--)); // 6
        System.out.println("After a--: a = " + a); // 5

        // Pre-increment
        System.out.println("++a = " + (++a)); // 6

        // Pre-decrement
        System.out.println("--a = " + (--a)); // 5
    }
}
