package ki304.salahub.Lab2;

/**
 * The `Dimensions` class represents the physical dimensions and attributes of a
 * scanner, including length, width, height, brand, handle presence, and color
 * scanning capability.
 *
 * This class provides methods to get and set information related to the
 * dimensions of the scanner.
 *
 * @author [Andriy]
 * @version 1.0
 * @since 2023-11-16
 */
public class Dimensions {

	private double length;
	private double width;
	private double height;

	private String brand;
	private boolean isHandle; // Whether the scanner has a handle
	private boolean isColorScan;

	/**
	 * Default constructor for the `Dimensions` class. Initializes default values
	 * for dimensions and attributes.
	 */
	public Dimensions() {
		length = 50.0;
		width = 25.0;
		height = 10;

		brand = "Canon";
		isHandle = false;
		isColorScan = true;
	}

	/**
	 * Constructor for the `Dimensions` class with specified parameters.
	 *
	 * @param length      The length of the scanner.
	 * @param width       The width of the scanner.
	 * @param height      The height of the scanner.
	 * @param brand       The brand of the scanner.
	 * @param isHandle    Indicates whether the scanner has a handle.
	 * @param isColorScan Indicates whether the scanner supports color scanning.
	 */
	public Dimensions(double length, double width, double height, String brand, boolean isHandle, boolean isColorScan) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.brand = brand;
		this.isHandle = isHandle;
		this.isColorScan = isColorScan;
	}

	/**
	 * Gets the length of the scanner.
	 *
	 * @return The length of the scanner.
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Gets the width of the scanner.
	 *
	 * @return The width of the scanner.
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Gets the height of the scanner.
	 *
	 * @return The height of the scanner.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Gets the brand of the scanner.
	 *
	 * @return The brand of the scanner.
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Checks if the scanner has a handle.
	 *
	 * @return `true` if the scanner has a handle, otherwise `false`.
	 */
	public boolean getIsHandle() {
		return isHandle;
	}

	/**
	 * Checks if the scanner supports color scanning.
	 *
	 * @return `true` if color scanning is supported, otherwise `false`.
	 */
	public boolean getIsColorScan() {
		return isColorScan;
	}

	/**
	 * Sets the length of the scanner.
	 *
	 * @param length The new length of the scanner.
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Sets the width of the scanner.
	 *
	 * @param width The new width of the scanner.
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Sets the height of the scanner.
	 *
	 * @param height The new height of the scanner.
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Sets the brand of the scanner.
	 *
	 * @param brand The new brand of the scanner.
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * Sets whether the scanner has a handle.
	 *
	 * @param isHandle `true` if the scanner has a handle, `false` otherwise.
	 */
	public void setIsHandle(boolean isHandle) {
		this.isHandle = isHandle;
	}

	/**
	 * Sets whether the scanner supports color scanning.
	 *
	 * @param isColorScan `true` to enable color scanning, `false` otherwise.
	 */
	public void setIsColorScan(boolean isColorScan) {
		this.isColorScan = isColorScan;
	}
}
