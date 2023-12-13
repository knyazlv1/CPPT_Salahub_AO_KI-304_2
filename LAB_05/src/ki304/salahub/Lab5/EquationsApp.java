package ki304.salahub.Lab5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * The EquationsApp class is the main class of the Equations application. 
 * It takes user input for a value 'X', calculates the corresponding 'Y' using the Equations class,
 * and performs input/output operations using the FileInOut class.
 *
 * @author Andriy
 * @version 1.0
 * @since 2023-11-26
 */
public class EquationsApp {

    /**
     * The main method of the EquationsApp class. It initializes necessary objects,
     * takes user input, performs calculations, and handles exceptions.
     *
     * @param args Command-line arguments (not used in this application).
     * @throws FileNotFoundException If a specified file for input/output is not found.
     * @throws IOException If an I/O error occurs during file operations.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Initialize FileInOut object for file input/output operations
        FileInOut fio = new FileInOut();

        try {
            // Initialize Equations object for mathematical calculations
            Equations eq = new Equations();

            // Prompt user for input
            System.out.print("Enter X: ");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            in.close();

            // Calculate Y and display the result
            double result = eq.calculate(x);
            System.out.println("Y: " + result);

            // Write the result to .txt and .bin files
            fio.writeResTxt(result);
            fio.writeResBin(result);

            // Display the result read from .txt and .bin files
            System.out.println("Output of the result from the file .txt: " + fio.readResTxt());
            System.out.println("Output of the result from the file .bin: " + fio.readResBin());
        } catch (CalcException ex) {
            // Handle custom exception for calculation errors
            System.out.print(ex.getMessage());
        }
    }
}
