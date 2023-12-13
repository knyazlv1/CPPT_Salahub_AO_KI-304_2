package ki304.salahub.Lab6;

/**
 * The WeaponObject interface defines the contract for objects representing weapons.
 * Classes implementing this interface must provide a method to print information
 * and a method to get the caliber of the weapon.
 *
 * It extends the Comparable interface, allowing for comparisons based on caliber.
 *
 * @author Andriy
 * @version 1.0
 * @since 2023-11-26
 */
public interface WeaponObject extends Comparable<WeaponObject> {

    /**
     * Prints information about the weapon.
     */
    void printInfo();

    /**
     * Gets the caliber of the weapon.
     *
     * @return The caliber of the weapon.
     */
    double getCaliber();
}

