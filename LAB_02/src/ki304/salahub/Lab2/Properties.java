package ki304.salahub.Lab2;

/**
 * The `Properties` class represents the properties of a scanner, including
 * information about duplex scanning, resolution (DPI), photogetter, optical
 * system, interface, and the light source.
 *
 * This class provides methods to get and set properties related to scanner
 * functionality.
 *
 * @author Andriy
 * @version 1.0
 */
public class Properties {
	private boolean isDuplex;
	private int resolutionDPI;
	private String photogetter;
	private String opticalSystem;
	private String interFace;
	private String sourceOfLight;

	/**
	 * Default constructor for the `Properties` class. Initializes default values
	 * for properties.
	 */
	public Properties() {
		isDuplex = true;
		resolutionDPI = 600;
		photogetter = "CCD";
		opticalSystem = "Class1";
		interFace = "RS232-C";
		sourceOfLight = "Xenon lamps";
	}

	/**
	 * Constructor for the `Properties` class with specified parameters.
	 *
	 * @param sourceOfLight The light source of the scanner.
	 * @param interFace     The interface of the scanner.
	 * @param opticalSystem The optical system of the scanner.
	 * @param photogetter   The photogetter of the scanner.
	 * @param resolutionDPI The resolution (DPI) of the scanner.
	 * @param isDuplex      Indicates whether the scanner supports duplex scanning.
	 */
	public Properties(String sourceOfLight, String interFace, String opticalSystem, String photogetter,
			int resolutionDPI, boolean isDuplex) {
		this.isDuplex = isDuplex;
		this.resolutionDPI = resolutionDPI;
		this.photogetter = photogetter;
		this.opticalSystem = opticalSystem;
		this.interFace = interFace;
		this.sourceOfLight = sourceOfLight;
	}

	/**
	 * Gets the light source of the scanner.
	 *
	 * @return The light source.
	 */
	public String getSourceOfLight() {
		return sourceOfLight;
	}

	/**
	 * Sets the light source of the scanner.
	 *
	 * @param sourceOfLight The new light source.
	 */
	public void setSourceOfLight(String sourceOfLight) {
		this.sourceOfLight = sourceOfLight;
	}

	/**
	 * Gets the interface of the scanner.
	 *
	 * @return The interface.
	 */
	public String getInterFace() {
		return interFace;
	}

	/**
	 * Sets the interface of the scanner.
	 *
	 * @param interFace The new interface.
	 */
	public void setInterFace(String interFace) {
		this.interFace = interFace;
	}

	/**
	 * Gets the optical system of the scanner.
	 *
	 * @return The optical system.
	 */
	public String getOpticalSystem() {
		return opticalSystem;
	}

	/**
	 * Sets the optical system of the scanner.
	 *
	 * @param opticalSystem The new optical system.
	 */
	public void setOpticalSystem(String opticalSystem) {
		this.opticalSystem = opticalSystem;
	}

	/**
	 * Gets the photogetter of the scanner.
	 *
	 * @return The photogetter.
	 */
	public String getPhotogetter() {
		return photogetter;
	}

	/**
	 * Sets the photogetter of the scanner.
	 *
	 * @param photogetter The new photogetter.
	 */
	public void setPhotogetter(String photogetter) {
		this.photogetter = photogetter;
	}

	/**
	 * Gets the resolution (DPI) of the scanner.
	 *
	 * @return The resolution (DPI).
	 */
	public int getResolutionDPI() {
		return resolutionDPI;
	}

	/**
	 * Sets the resolution (DPI) of the scanner.
	 *
	 * @param resolutionDPI The new resolution (DPI).
	 */
	public void setResolutionDPI(int resolutionDPI) {
		this.resolutionDPI = resolutionDPI;
	}

	/**
	 * Checks if the scanner supports duplex scanning.
	 *
	 * @return `true` if duplex scanning is supported, otherwise `false`.
	 */
	public boolean isDuplex() {
		return isDuplex;
	}

	/**
	 * Sets whether the scanner supports duplex scanning.
	 *
	 * @param isDuplex `true` to enable duplex scanning, `false` otherwise.
	 */
	public void setDuplex(boolean isDuplex) {
		this.isDuplex = isDuplex;
	}

}
