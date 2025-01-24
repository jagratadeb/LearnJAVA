public class Operator2Assignment {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Assignment Operators");
        System.out.println("Initial value of x = " + x); // 10
        System.out.println("Initial value of y = " + y); // 5

        x += y;
        System.out.println("x += y => x = " + x); // 15

        x -= y;
        System.out.println("x -= y => x = " + x); // 10

        x *= y;
        System.out.println("x *= y => x = " + x); // 50

        x /= y;
        System.out.println("x /= y => x = " + x); // 10

        x %= y;
        System.out.println("x %= y => x = " + x); // 0

        // Note: Java doesn't support the exponentiation operator (**),
        // so we'll use Math.pow() for x ** y
        x = (int)Math.pow(x, y);
        System.out.println("x **= y => x = " + x); // 0 (since x was 0 after the modulo operation, 0 ^ 5 is still 0)

        x = 10;
        y = 2;

        x <<= y;
        System.out.println("x <<= y => x = " + x); // 40 (Left shift)

        x >>= y;
        System.out.println("x >>= y => x = " + x); // 10 (Right shift)
    }
}
