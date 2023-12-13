package ki304.salahub.Lab6;

/**
 * The Ammunation class represents a type of weapon object, specifically ammunition.
 * It implements the WeaponObject interface and provides information about the projectile,
 * length, and caliber of the ammunition.
 *
 * @author Andriy
 * @version 1.0
 * @since 2023-11-26
 */
public class Ammunation implements WeaponObject {
    private String projectile;
    private double length;
    private double caliber;

    /**
     * Constructs an Ammunation object with specified projectile, length, and caliber.
     *
     * @param projectile The type of projectile.
     * @param length     The length of the ammunition.
     * @param caliber    The caliber of the ammunition.
     */
    public Ammunation(String projectile, double length, double caliber) {
        this.length = length;
        this.caliber = caliber;
        this.projectile = projectile;
    }

    /**
     * Gets the length of the ammunition.
     *
     * @return The length of the ammunition.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the ammunition.
     *
     * @param length The new length of the ammunition.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Gets the caliber of the ammunition.
     *
     * @return The caliber of the ammunition.
     */
    public double getCaliber() {
        return caliber;
    }

    /**
     * Sets the caliber of the ammunition.
     *
     * @param caliber The new caliber of the ammunition.
     */
    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    /**
     * Compares this ammunition with another WeaponObject based on caliber.
     *
     * @param o The WeaponObject to compare.
     * @return A negative integer, zero, or a positive integer as this object is less than,
     *         equal to, or greater than the specified object.
     */
    public int compareTo(WeaponObject o) {
        Double l = getCaliber();
        return l.compareTo(o.getCaliber());
    }

    /**
     * Prints information about the ammunition, including projectile type, length, and caliber.
     */
    public void printInfo() {
        System.out.print("Projectile: " + getProjectile());
        System.out.print(" Length: " + getLength());
        System.out.println(" Caliber: " + getCaliber());
    }

    /**
     * Gets the type of projectile.
     *
     * @return The type of projectile.
     */
    public String getProjectile() {
        return projectile;
    }

    /**
     * Sets the type of projectile.
     *
     * @param projectile The new type of projectile.
     */
    public void setProjectile(String projectile) {
        this.projectile = projectile;
    }
}
