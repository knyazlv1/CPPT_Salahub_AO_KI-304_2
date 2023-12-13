package ki304.salahub.Lab6;

/**
 * The Driver class serves as the entry point for the WeaponCase application.
 * It demonstrates the usage of the WeaponCase class with various WeaponObject instances.
 *
 * @author Andriy
 * @version 1.0
 * @since 2023-11-26
 */
public class Driver {

    /**
     * The main method of the Driver class. It creates a WeaponCase, puts various WeaponObject instances into it,
     * performs operations on the WeaponCase, and demonstrates the functionality of the application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a WeaponCase that can hold WeaponObjects or their superclasses
        WeaponCase<? super WeaponObject> wCase = new WeaponCase<WeaponObject>();

        // Add Gun instances and Ammunation instances to the WeaponCase
        wCase.putInObj(new Gun(45.5, "Stell", "AK-47", 7.62));
        wCase.putInObj(new Gun(45.5, "Stell", "M4A4", 5.56));
        wCase.putInObj(new Ammunation("Bullet", 6.0, 5.56));
        wCase.putInObj(new Ammunation("Cartech", 5.0, 12.0));

        // Find and display the minimum caliber among the WeaponObjects in the WeaponCase
        wCase.findMin();

        // Display information about all objects in the WeaponCase
        wCase.seeAllObjects();

        // Extract the object at index 1 from the WeaponCase and display the updated list
        wCase.extractTheObject(1);
        wCase.seeAllObjects();
    }
}

