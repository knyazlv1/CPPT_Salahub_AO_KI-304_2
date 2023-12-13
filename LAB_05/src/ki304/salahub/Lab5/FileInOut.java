package ki304.salahub.Lab5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The FileInOut class provides methods for input and output operations to and
 * from files. It supports both text (.txt) and binary (.bin) file formats.
 *
 * @author Andriy
 * @version 1.0
 * @since 2023-11-26
 */
public class FileInOut {
	/**
	 * The default file name used if not specified during object creation.
	 */
	private String fileName;

	/**
	 * Default constructor that sets the file name to "Lab5".
	 */
	public FileInOut() {
		fileName = "Lab5";
	}

	/**
	 * Constructor that allows setting the file name during object creation.
	 *
	 * @param fileName The name of the file to work with.
	 */
	public FileInOut(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Writes the result to a text file.
	 *
	 * @param result The result to be written.
	 * @throws FileNotFoundException If the file is not found.
	 */
	public void writeResTxt(double result) throws FileNotFoundException {
		PrintWriter file = new PrintWriter(new File(fileName + ".txt"));
		file.print(result);
		file.close();
	}

	/**
	 * Reads the result from a text file.
	 *
	 * @return A string containing the result.
	 */
	public String readResTxt() {
		String fileName = this.fileName + ".txt";
		String result;
		try {
			File file = new File(fileName);
			if (file.exists()) {
				Scanner scanner = new Scanner(file);
				result = scanner.next();
				scanner.close();
			} else {
				throw new FileNotFoundException("File " + fileName + " not found");
			}
		} catch (FileNotFoundException ex) {
			result = ex.getMessage();
		}
		return result;
	}

	/**
	 * Writes the result to a binary file.
	 *
	 * @param result The result to be written.
	 * @throws FileNotFoundException If the file is not found.
	 * @throws IOException           If an I/O error occurs during file operations.
	 */
	public void writeResBin(double result) throws FileNotFoundException, IOException {
		DataOutputStream file = new DataOutputStream(new FileOutputStream(fileName + ".bin"));
		file.writeDouble(result);
		file.close();
	}

	/**
	 * Reads the result from a binary file.
	 *
	 * @return A double value containing the result.
	 * @throws FileNotFoundException If the file is not found.
	 * @throws IOException           If an I/O error occurs during file operations.
	 */
	public double readResBin() throws FileNotFoundException, IOException {
		DataInputStream file = new DataInputStream(new FileInputStream(fileName + ".bin"));
		double result;
		result = file.readDouble();
		file.close();
		return result;
	}
}
