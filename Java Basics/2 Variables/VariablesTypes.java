
class VariablesTypes {

    // Static variable (shared by all instances of the class)
    static int sharedValue = 0;

    // Instance variable (unique to each instance)
    int uniqueValue;

    // Constructor to initialize instance variables
    public VariablesTypes(int uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    public void displayValues() {
        // Local variable (exists only within this method)
        int tempValue = 5;
        System.out.println("Local Variable: " + tempValue);

        // Accessing instance and static variables
        System.out.println("Instance Variable: " + this.uniqueValue);
        System.out.println("Static Variable: " + sharedValue);
    }

    public static void main(String[] args) {
        // Creating instances of the class
        VariablesTypes firstInstance = new VariablesTypes(1);
        VariablesTypes secondInstance = new VariablesTypes(2);

        // Modifying static and instance variables
        firstInstance.uniqueValue = 10;
        VariablesTypes.sharedValue = 20;

        // Calling the method
        System.out.println("1st Instance Values:");
        firstInstance.displayValues();
        System.out.println("\n2nd Instance Values:");
        secondInstance.displayValues();

    }

}

// static
// local
// instance
