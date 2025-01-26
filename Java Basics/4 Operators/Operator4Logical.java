
public class Operator4Logical {

    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;

        System.out.println("Logical Operators");

        // AND
        System.out.println("p && q : " + (p && q)); // false

        // OR
        System.out.println("p || q : " + (p || q)); // true

        // NOT
        System.out.println("!p : " + (!p)); // false
        System.out.println("!q : " + (!q)); // true
    }
}
