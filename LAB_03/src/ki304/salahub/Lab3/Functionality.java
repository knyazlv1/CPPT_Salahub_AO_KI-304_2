package ki304.salahub.Lab3;
/**
 * The {@code Functionality} class represents the functionality attributes of a scanner,
 * including information about the barcode, QR code, document, photo, buffer status,
 * success of saving information, and power status.
 *
 * <p>It provides methods to get and set each functionality attribute and includes
 * default values in the default constructor.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 *   // Create an instance of Functionality with default values
 *   Functionality defaultFunctionality = new Functionality();
 *
 *   // Create an instance of Functionality with specified parameters
 *   Functionality customFunctionality = new Functionality("123456", "QR123", true, true, true, "Doc1", "Photo1");
 *
 *   // Get and set individual functionality attributes
 *   String barcode = customFunctionality.getBarcode();
 *   customFunctionality.setSuccessSaveInfo(false);
 * }
 * </pre>
 *
 * @see Scaner
 * @see CopyMachine
 * @see Properties
 * @see Dimensions
 * @author Andriy
 * @version 1.0
 * @since 2023-11-23
 */
public class Functionality {
	

		private boolean power;
		private String barcode;
		private String qrcode;
		private String document;
		private String photo;
		private boolean emptinessBuffer;
		private boolean successSaveInfo;

		/**
		 * Default constructor for the `Functionality` class. Initializes default values
		 * for functionality attributes.
		 */
		public Functionality() {
			barcode = "000000";
			qrcode = "non qr";
			emptinessBuffer = true;
			successSaveInfo = false;
			document = "";
			photo = "";
			setPower(false);
		}

		/**
		 * Constructor for the `Functionality` class with specified parameters.
		 *
		 * @param barcode         The barcode of the scanner.
		 * @param qrcode          The QR code of the scanner.
		 * @param emptinessBuffer Indicates whether the scanner's buffer is empty.
		 * @param successSaveInfo Indicates the success of saving information.
		 * @param power           The power status of the scanner.
		 * @param document        The scanned document information.
		 * @param photo           The scanned photo information.
		 */
		public Functionality(String barcode, String qrcode, boolean emptinessBuffer, boolean successSaveInfo, boolean power,
				String document, String photo) {
			this.barcode = barcode;
			this.qrcode = qrcode;
			this.successSaveInfo = successSaveInfo;
			this.emptinessBuffer = emptinessBuffer;
			this.power = power;
			this.document = document;
			this.photo = photo;
		}

		/**
		 * Gets the barcode of the scanner.
		 *
		 * @return The barcode.
		 */
		public String getBarcode() {
			return barcode;
		}

		/**
		 * Sets the barcode of the scanner.
		 *
		 * @param barcode The new barcode.
		 */
		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		/**
		 * Gets the QR code of the scanner.
		 *
		 * @return The QR code.
		 */
		public String getQrcode() {
			return qrcode;
		}

		/**
		 * Sets the QR code of the scanner.
		 *
		 * @param qrcode The new QR code.
		 */
		public void setQrcode(String qrcode) {
			this.qrcode = qrcode;
		}

		/**
		 * Gets the success status of saving information.
		 *
		 * @return `true` if information was successfully saved, otherwise `false`.
		 */
		public boolean getSuccessSaveInfo() {
			return successSaveInfo;
		}

		/**
		 * Sets the success status of saving information.
		 *
		 * @param successSaveInfo `true` if information was successfully saved, `false`
		 *                        otherwise.
		 */
		public void setSuccessSaveInfo(boolean successSaveInfo) {
			this.successSaveInfo = successSaveInfo;
		}

		/**
		 * Gets whether the scanner's buffer is empty.
		 *
		 * @return `true` if the buffer is empty, otherwise `false`.
		 */
		public boolean getEmptinessBuffer() {
			return emptinessBuffer;
		}

		/**
		 * Sets whether the scanner's buffer is empty.
		 *
		 * @param emptinessBuffer `true` if the buffer is empty, `false` otherwise.
		 */
		public void setEmptinessBuffer(boolean emptinessBuffer) {
			this.emptinessBuffer = emptinessBuffer;
		}

		/**
		 * Gets the power status of the scanner.
		 *
		 * @return `true` if the scanner is powered on, otherwise `false`.
		 */
		public boolean getPower() {
			return power;
		}

		/**
		 * Sets the power status of the scanner.
		 *
		 * @param power `true` to power on the scanner, `false` to power off.
		 */
		public void setPower(boolean power) {
			this.power = power;
		}

		/**
		 * Gets the scanned document information.
		 *
		 * @return The scanned document information.
		 */
		public String getDocument() {
			return document;
		}

		/**
		 * Sets the scanned document information.
		 *
		 * @param document The new scanned document information.
		 */
		public void setDocument(String document) {
			this.document = document;
		}

		/**
		 * Gets the scanned photo information.
		 *
		 * @return The scanned photo information.
		 */
		public String getPhoto() {
			return photo;
		}

		/**
		 * Sets the scanned photo information.
		 *
		 * @param photo The new scanned photo information.
		 */
		public void setPhoto(String photo) {
			this.photo = photo;
		}
}
