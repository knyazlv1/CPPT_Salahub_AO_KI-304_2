package ki304.salahub.Lab2;

import java.io.FileNotFoundException;

/*
 * The `DriverScaner` class serves as the driver program to demonstrate the
 * functionality of the `Scaner` class by creating an instance and performing
 * various operations.
 *
 * This class contains the main method that creates a scanner instance,
 * retrieves and prints information about the scanner's properties, connection,
 * and dimensions, turns on the power, performs barcode, QR code, document, and
 * photo scanning, and finally turns off the power.
 *
 * @author [Andriy]
 * @version 1.0
 * @since 2023-11-16
 */
public class DriverScaner {

	public static void main(String[] args) throws FileNotFoundException {
		Scaner n1 = new Scaner(50, 25, 10, "Canon", true, true, "Laser", "ARM", "PZZ", "Camera", 2400, true);
		n1.getInfoProperties();
		n1.getInfoScanerDimensions();
		n1.turnOnPower();
		n1.scanBarCodeAndSaveData("4821456895");
		n1.scanQRCodeAndSaveData("https//t.me//KItop");
		n1.scanDocumentAndSaveData("scanned.doc");
		n1.scanPhotoAndSaveData("Photo with cat");
		n1.rebootScaner();
		n1.turnOffPower();
		

	}

}
