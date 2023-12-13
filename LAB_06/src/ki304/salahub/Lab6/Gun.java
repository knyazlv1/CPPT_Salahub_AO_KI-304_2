package ki304.salahub.Lab6;


/**
 * The Gun class represents a type of weapon object, specifically a firearm.
 * It implements the WeaponObject interface and provides information about the length,
 * material, title, and caliber of the gun.
 *
  * @author Andriy
 * @version 1.0
 * @since 2023-11-26
 */
public class Gun implements WeaponObject {
    private double length;
    private String material;
    private String title;
    private double caliber;

    /**
     * Constructs a Gun object with specified length, material, title, and caliber.
     *
     * @param length   The length of the gun.
     * @param material The material of the gun.
     * @param title    The title or name of the gun.
     * @param caliber  The caliber of the gun.
     */
    public Gun(double length, String material, String title, double caliber) {
        this.length = length;
        this.material = material;
        this.title = title;
        this.caliber = caliber;
    }

    /**
     * Gets the length of the gun.
     *
     * @return The length of the gun.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the gun.
     *
     * @param length The new length of the gun.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Gets the material of the gun.
     *
     * @return The material of the gun.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the material of the gun.
     *
     * @param material The new material of the gun.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Gets the caliber of the gun.
     *
     * @return The caliber of the gun.
     */
    public double getCaliber() {
        return caliber;
    }

    /**
     * Sets the caliber of the gun.
     *
     * @param caliber The new caliber of the gun.
     */
    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    /**
     * Gets the title or name of the gun.
     *
     * @return The title or name of the gun.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title or name of the gun.
     *
     * @param title The new title or name of the gun.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Compares this gun with another WeaponObject based on caliber.
     *
     * @param o The WeaponObject to compare.
     * @return A negative integer, zero, or a positive integer as this object is less than,
     *         equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(WeaponObject o) {
        Double c = getCaliber();
        return c.compareTo(o.getCaliber());
    }

    /**
     * Prints information about the gun, including title, length, material, and caliber.
     */
    @Override
    public void printInfo() {
        System.out.print("Object: " + getTitle());
        System.out.print(" Length: " + getLength());
        System.out.print(" Material: " + getMaterial());
        System.out.println(" Caliber: " + getCaliber());
    }
}

