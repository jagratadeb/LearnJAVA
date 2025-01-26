
public class Operator6Ternary {

    public static void main(String[] args) {
        int age = 18;
        String canVote = (age >= 18) ? "Yes" : "No";

        System.out.println("Ternary Operator");
        System.out.println("Can vote: " + canVote); // Yes
    }
}
