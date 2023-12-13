package ki304.salahub.Lab3;

import java.io.FileNotFoundException;
/**
 * The {@code Driver} class contains the main method for testing the functionality
 * of the {@link CopyMachine} class and its interactions with the {@link Scaner},
 * {@link Properties}, {@link Dimensions}, and {@link Functionality} classes.
 *
 * <p>It creates an instance of the {@code CopyMachine} class, performs various
 * operations such as changing the cartridge, turning on the power, obtaining
 * information about the scanner's dimensions, scanning photos and documents, and
 * printing them.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 *   // Create an instance of CopyMachine
 *   CopyMachine cm = new CopyMachine();
 *
 *   // Test various operations
 *   cm.changeCardrige();
 *   cm.turnOnPower();
 *   cm.getInfoScanerDimensions();
 *   cm.changeCardrige();
 *   cm.scanPhotoAndSaveData("cat");
 *   cm.printPhoto("cat");
 *   cm.scanPhotoAndSaveData("cat");
 *   cm.printPhoto("cat");
 *   cm.scanDocumentAndSaveData("CV.docx");
 *   cm.printDoc("CV.docx");
 * }
 * </pre>
 *
 * @see CopyMachine
 * @see Scaner
 * @see Properties
 * @see Dimensions
 * @see Functionality
 * @author Andriy
 * @version 1.0
 * @since 2023-11-16
 */
public class Driver {
	/**
     * The main method for testing the functionality of the {@code CopyMachine} class.
     *
     * @param args The command-line arguments (not used in this context).
     * @throws FileNotFoundException if an error occurs while creating the log file.
     */
	public static void main(String[] args) throws FileNotFoundException {
		CopyMachine cm = new CopyMachine();
		cm.changeCardrige();
		cm.turnOnPower();
		cm.getInfoScanerDimensions();
		cm.changeCardrige();
		cm.scanPhotoAndSaveData("cat");
		cm.printPhoto("cat");
		cm.scanPhotoAndSaveData("cat");
		cm.printPhoto("cat");
		cm.scanDocumentAndSaveData("CV.docx");
		cm.printDoc("CV.docx");

	}

}
