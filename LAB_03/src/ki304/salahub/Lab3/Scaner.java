package ki304.salahub.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * The {@code Scaner} class is an abstract class representing a scanner with
 * dimensions, properties, functionality, and logging capabilities.
 *
 * <p>Subclasses are expected to implement specific scanning functionalities.</p>
 *
 * @see Properties
 * @see Dimensions
 * @see Functionality
 * @see CopyMachine
 * @author Andriy
 * @version 1.0
 * @since 2023-11-16
 */


public abstract class Scaner {
	protected Properties prop;
	protected Dimensions dimension;

	protected Functionality func;
	protected PrintWriter file;

	/**
	 * Default constructor for the `Scaner` class. Initializes the dimensions,
	 * properties, connection, functionality, and log file.
	 *
	 * @throws FileNotFoundException if the log file cannot be created.
	 */
	public Scaner() throws FileNotFoundException {
		dimension = new Dimensions();
		prop = new Properties();

		func = new Functionality();
		file = new PrintWriter(new File("Scaner_log.txt"));
	}
	/**
	 * Constructor for the `Scaner` class with all parameters.
	 *
	 * @param length              The length of the scanner.
	 * @param width               The width of the scanner.
	 * @param height              The height of the scanner.
	 * @param brand               The brand of the scanner.
	 * @param isHandle            Indicates whether the scanner has a handle.
	 * @param isColorScan         Indicates whether the scanner supports color
	 *                            scanning.
	 * @param sourceOfLight       The light source of the scanner.
	 * @param interFace           The interface of the scanner.
	 * @param opticalSystem       The optical system of the scanner.
	 * @param photogetter         The photogetter of the scanner.
	 * @param resolutionDPI       The resolution (DPI) of the scanner.
	 * @param isDuplex            Indicates whether the scanner supports duplex
	 *                            scanning.
	 * @param isWireConnectToPC   Indicates whether the scanner is wire-connected to
	 *                            a PC.
	 * @param isNetworkConnection Indicates whether the scanner has a network
	 *                            connection.
	 * @throws FileNotFoundException if the log file cannot be created.
	 */
	public Scaner(double length, double width, double height, String brand, boolean isHandle, boolean isColorScan,
			String sourceOfLight, String interFace, String opticalSystem, String photogetter, int resolutionDPI,
			boolean isDuplex) throws FileNotFoundException {
		dimension = new Dimensions(length, width, height, brand, isHandle, isColorScan);
		prop = new Properties(sourceOfLight, interFace, opticalSystem, photogetter, resolutionDPI, isDuplex);

		func = new Functionality();
		file = new PrintWriter(new File("Scaner_log.txt"));

	}

	/**
	 * Constructor for the `Scaner` class with dimension parameters.
	 *
	 * @param length      The length of the scanner.
	 * @param width       The width of the scanner.
	 * @param height      The height of the scanner.
	 * @param brand       The brand of the scanner.
	 * @param isHandle    Indicates whether the scanner has a handle.
	 * @param isColorScan Indicates whether the scanner supports color scanning.
	 * @throws FileNotFoundException if the log file cannot be created.
	 */
	public Scaner(double length, double width, double height, String brand, boolean isHandle, boolean isColorScan)
			throws FileNotFoundException {
		dimension = new Dimensions(length, width, height, brand, isHandle, isColorScan);
		prop = new Properties();
		func = new Functionality();
		file = new PrintWriter(new File("Scaner_log.txt"));
	}

	/**
	 * Constructor for the `Scaner` class with properties parameters.
	 *
	 * @param sourceOfLight The light source of the scanner.
	 * @param interFace     The interface of the scanner.
	 * @param opticalSystem The optical system of the scanner.
	 * @param photogetter   The photogetter of the scanner.
	 * @param resolutionDPI The resolution (DPI) of the scanner.
	 * @param isDuplex      Indicates whether the scanner supports duplex scanning.
	 * @throws FileNotFoundException if the log file cannot be created.
	 */
	public Scaner(String sourceOfLight, String interFace, String opticalSystem, String photogetter, int resolutionDPI,
			boolean isDuplex) throws FileNotFoundException {
		dimension = new Dimensions();
		prop = new Properties(sourceOfLight, interFace, opticalSystem, photogetter, resolutionDPI, isDuplex);
		func = new Functionality();
		file = new PrintWriter(new File("Scaner_log.txt"));

	}

	/**
	 * Retrieves and logs information about the scanner's dimensions.
	 */
	public void getInfoScanerDimensions() {
		file.println("Brand of scaner: " + dimension.getBrand() + "\n" +
				"Length of scaner: " + dimension.getLength() + "\n" + 
				"Width of scaner: " + dimension.getWidth() + "\n" + 
				"Height of scaner: "+ dimension.getHeight() + "\n" +
				"Scaner have a handle: " + dimension.getIsHandle() + "\n"+
				"Scaner have the color scan: " + dimension.getIsColorScan() + "\n");
		file.println();
		file.flush();
	}

	/**
	 * Retrieves and logs information about the scanner's properties.
	 */
	public void getInfoProperties() {
		file.println("Scaner is duplex: " + prop.isDuplex() + "\n" + "Resulotin DPI: " + prop.getResolutionDPI() + "\n"
				+ "Photogetter: " + prop.getPhotogetter() + "\n" + "Optical system: " + prop.getOpticalSystem() + "\n"
				+ "Interface: " + prop.getInterFace() + "\n" + "Source of light: " + prop.getSourceOfLight());
		file.println();
		file.flush();
	}

	/**
	 * Turns off the power of the scanner and logs the action.
	 */
	public void turnOffPower() {
		func.setPower(false);
		file.println("The scanner is off: " + func.getPower() + "\n");
		file.println();
		file.flush();

	}

	/**
	 * Turns on the power of the scanner and logs the action.
	 */
	public void turnOnPower() {
		func.setPower(true);
		file.println("The scanner is on: " + func.getPower() + "\n");
		file.println();
		file.flush();
	}

	/**
	 * Cleans the buffer of the scanner and logs the action.
	 */
	public void cleanBuffer() {
		func.setEmptinessBuffer(true);
		file.println("Buffer is clean:" + func.getEmptinessBuffer());
		file.println();
		file.flush();
	}

	/**
	 * Scans a barcode, saves the data, and logs the action.
	 *
	 * @param barcode The barcode to be scanned.
	 */
	public void scanBarCodeAndSaveData(String barcode) {
		if (func.getPower() == true) {
			func.setBarcode(barcode);
			file.println("Point the scanner at the barcode!");
			file.println("Scanned barcode: " + func.getBarcode());
			func.setEmptinessBuffer(false);
			file.println("Emptiness of buffer:" + func.getEmptinessBuffer());
			func.setSuccessSaveInfo(true);
			file.println("Data successfully saved: " + func.getSuccessSaveInfo());
			cleanBuffer();
			file.println();
			file.flush();

		} else {
			file.println("Failed to scan, the scanner is not enabled");
			file.flush();
		}
	}

	/**
	 * Scans a QR code, saves the data, and logs the action.
	 *
	 * @param qrcode The QR code to be scanned.
	 */
	public void scanQRCodeAndSaveData(String qrcode) {
		if (func.getPower() == true) {
			func.setQrcode(qrcode);
			file.println("Point the scanner at the qrrcode!");
			file.println("Scanned qrcode: " + func.getQrcode());
			func.setEmptinessBuffer(false);
			file.println("Emptiness of buffer:" + func.getEmptinessBuffer());
			func.setSuccessSaveInfo(true);
			file.println("Data successfully saved: " + func.getSuccessSaveInfo());
			cleanBuffer();
			file.println();
			file.flush();

		} else {
			file.println("Failed to scan, the scanner is not enabled");
			file.flush();
		}
	}

	/**
	 * Scans a document, saves the data, and logs the action.
	 *
	 * @param document The document to be scanned.
	 */
	public void scanDocumentAndSaveData(String document) {
		if (func.getPower() == true) {
			func.setDocument(document);
			file.println("Point the scanner at the document or put document into the scaner!");
			file.println("Scanned document: " + func.getDocument());
			func.setEmptinessBuffer(false);
			file.println("Emptiness of buffer:" + func.getEmptinessBuffer());
			func.setSuccessSaveInfo(true);
			file.println("Data successfully saved: " + func.getSuccessSaveInfo());
			cleanBuffer();
			file.println();
			file.flush();

		} else {
			file.println("Failed to scan, the scanner is not enabled");
			file.flush();
		}
	}

	/**
	 * Scans a photo, saves the data, and logs the action.
	 *
	 * @param photo The photo to be scanned.
	 */
	public void scanPhotoAndSaveData(String photo) {
	
		if (func.getPower() == true) {
			func.setPhoto(photo);
			file.println("Point the scanner at photo or put photo into the scaner!");
			file.println("Scanned photo: " + func.getPhoto());
			func.setEmptinessBuffer(false);
			file.println("Emptiness of buffer:" + func.getEmptinessBuffer());
			func.setSuccessSaveInfo(true);
			file.println("Data successfully saved: " + func.getSuccessSaveInfo());
			cleanBuffer();
			file.println();
			file.flush();

		} else {
			file.println("Failed to scan, the scanner is not enabled");
			file.flush();
		}
		
		
	}
	 /**
     * Reboots the scanner and logs the action.
     */
	public void rebootScaner() {
		file.println("Scanner restarted");
		file.println();
		file.flush();
	}

}
