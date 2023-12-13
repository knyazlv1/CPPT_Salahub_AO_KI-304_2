package ki304.salahub.Lab4;

import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 * The {@code EquationsApp} class is a simple application for calculating and outputting the result of a trigonometric equation involving tangent.
 * It takes user input for the value of X, calculates the result, and outputs it to both the console and a file.
 *
 * <p>The application catches and handles exceptions related to calculation errors and file operations.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 *   try {
 *       EquationsApp equationsApp = new EquationsApp();
 *       equationsApp.run();
 *   } catch (Exception e) {
 *       System.out.println("An error occurred: " + e.getMessage());
 *   }
 * }
 * </pre>
 *
 * @see Equations
 * @see CalcException
 * @author [Your Name]
 * @version 1.0
 * @since [Date]
 */
public class EquationsApp {

    /**
     * The main method to run the equations application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        try {
            EquationsApp equationsApp = new EquationsApp();
            equationsApp.run();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Runs the equations application.
     * Takes user input, calculates the result, and outputs it to both the console and a file.
     *
     * @throws Exception If an error occurs during the application's execution.
     */
    public void run() throws Exception {
        try {
            PrintWriter file = new PrintWriter(new File("FileLab4.txt"));
            try {
                Equations eq = new Equations();
                out.print("Enter X: ");
                Scanner in = new Scanner(System.in);
                int x = in.nextInt();
                double result = eq.calculate(x);
                out.println("Y: " + result); // Output the result to the console
                file.print(result); // Write the result to the file
            } finally {
                file.flush();
                file.close();
            }
        } catch (CalcException ex) {
            // Catch calculation errors
            out.print(ex.getMessage());
        } catch (FileNotFoundException ex) {
            // Catch file-related errors, including those that occur in the finally block
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}
