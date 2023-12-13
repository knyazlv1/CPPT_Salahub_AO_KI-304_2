package ki304.salahub.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * The {@code CopyMachine} class represents a copying machine that extends a scanner
 * and implements the {@link Copy} interface. It provides functionality to print both
 * photos and documents, track the number of printed items, and change the cartridge.
 *
 * <p>Instances of this class can be created with different configurations, including
 * dimensions, brand, scanning capabilities, and printing options. The class also logs
 * information about the printing process to a file named "Scaner_log.txt".</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 *   // Create an instance of CopyMachine
 *   CopyMachine copier = new CopyMachine();
 *
 *   // Print a photo
 *   copier.printPhoto("my_photo.jpg");
 *
 *   // Print a document
 *   copier.printDoc("document.pdf");
 *
 *   // Change the cartridge if the machine is turned off
 *   copier.changeCardrige();
 * }
 * </pre>
 *
 * @see Copy
 * @author Andriy
 * @version 1.0
 * @since 2023-11-23
 * */
public class CopyMachine extends Scaner implements Copy {
	private int countPrintedPhoto;
	private int countPrintedDoc;
	 /**
     * Constructs a {@code CopyMachine} with default dimensions, properties, and functionality.
     * Initializes the counters for printed photos and documents to zero.
     * Creates a log file named "Scaner_log.txt".
     *
     * @throws FileNotFoundException if an error occurs while creating the log file.
     */
	public CopyMachine() throws FileNotFoundException {
		dimension = new Dimensions();
		prop = new Properties();

		func = new Functionality();
		countPrintedPhoto = 0;
		countPrintedDoc = 0;
		file = new PrintWriter(new File("Scaner_log.txt"));
	}
	/**
     * Constructs a {@code CopyMachine} with specified dimensions, properties, and functionality.
     * Initializes the counters for printed photos and documents to zero.
     * Creates a log file named "Scaner_log.txt".
     *
     * @param length        The length dimension of the machine.
     * @param width         The width dimension of the machine.
     * @param height        The height dimension of the machine.
     * @param brand         The brand of the machine.
     * @param isHandle      A flag indicating whether the machine has a handle.
     * @param isColorScan   A flag indicating whether the scanner supports color scanning.
     * @param sourceOfLight The source of light for the scanner.
     * @param interFace     The interface used by the machine.
     * @param opticalSystem The optical system used by the scanner.
     * @param photogetter   The photo getter used by the scanner.
     * @param resolutionDPI The resolution of the scanner in DPI.
     * @param isDuplex      A flag indicating whether the scanner supports duplex scanning.
     * @throws FileNotFoundException if an error occurs while creating the log file.
     */

	public CopyMachine(double length, double width, double height, String brand, boolean isHandle, boolean isColorScan,
			String sourceOfLight, String interFace, String opticalSystem, String photogetter, int resolutionDPI,
			boolean isDuplex) throws FileNotFoundException {
		dimension = new Dimensions(length, width, height, brand, isHandle, isColorScan);
		prop = new Properties(sourceOfLight, interFace, opticalSystem, photogetter, resolutionDPI, isDuplex);
		func = new Functionality();
		countPrintedPhoto = 0;
		countPrintedDoc = 0;
		file = new PrintWriter(new File("Scaner_log.txt"));

	}
	/**
     * Constructs a {@code CopyMachine} with specified dimensions, brand, and scanning capabilities.
     * Initializes the counters for printed photos and documents to zero.
     * Creates a log file named "Scaner_log.txt".
     *
     * @param length      The length dimension of the machine.
     * @param width       The width dimension of the machine.
     * @param height      The height dimension of the machine.
     * @param brand       The brand of the machine.
     * @param isHandle    A flag indicating whether the machine has a handle.
     * @param isColorScan A flag indicating whether the scanner supports color scanning.
     * @throws FileNotFoundException if an error occurs while creating the log file.
     */
	public CopyMachine(double length, double width, double height, String brand, boolean isHandle, boolean isColorScan)
			throws FileNotFoundException {
		dimension = new Dimensions(length, width, height, brand, isHandle, isColorScan);
		prop = new Properties();
		func = new Functionality();
		countPrintedPhoto = 0;
		countPrintedDoc = 0;
		file = new PrintWriter(new File("Scaner_log.txt"));
	}
	/**
     * Constructs a {@code CopyMachine} with specified scanning properties.
     * Initializes the counters for printed photos and documents to zero.
     * Creates a log file named "Scaner_log.txt".
     *
     * @param sourceOfLight The source of light for the scanner.
     * @param interFace     The interface used by the machine.
     * @param opticalSystem The optical system used by the scanner.
     * @param photogetter   The photo getter used by the scanner.
     * @param resolutionDPI The resolution of the scanner in DPI.
     * @param isDuplex      A flag indicating whether the scanner supports duplex scanning.
     * @throws FileNotFoundException if an error occurs while creating the log file.
     */

	public CopyMachine(String sourceOfLight, String interFace, String opticalSystem, String photogetter,
			int resolutionDPI, boolean isDuplex) throws FileNotFoundException {
		dimension = new Dimensions();
		prop = new Properties(sourceOfLight, interFace, opticalSystem, photogetter, resolutionDPI, isDuplex);
		func = new Functionality();
		countPrintedPhoto = 0;
		countPrintedDoc = 0;
		file = new PrintWriter(new File("Scaner_log.txt"));

	}
	 /**
     * Prints a photo using the copying machine and logs information about the printed photo.
     *
     * @param photo The name of the photo to be printed.
     */
	public void printPhoto(String photo) {
		file.println("There is a printed photo: " + photo);

		countPrintedPhoto++;
		file.println("Photos printed during the work: " + countPrintedPhoto);
		file.flush();
	}
	/**
     * Prints a document using the copying machine and logs information about the printed document.
     *
     * @param doc The name of the document to be printed.
     */
	public void printDoc(String doc) {
		file.println("There is a printed photo: " + doc);
		countPrintedDoc++;
		file.println("Photos printed during the work: " + countPrintedDoc);
		file.flush();
	}

	/**
     * Changes the cartridge of the copying machine. If the machine is powered on,
     * a message is logged indicating that the machine needs to be turned off before
     * changing the cartridge.
     */
	@Override
	public void changeCardrige() {
		if (func.getPower() == false) {
			file.println("Cardrige changed");
			file.println();
			file.flush();
		}
		else {
			file.println("Please off copymachine");
			file.println();
			file.flush();
		}

	}

}
