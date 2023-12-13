package ki304.salahub.Lab4;
/**
 * The {@code CalcException} class represents a custom exception for arithmetic errors
 * that may occur during calculations in the calculator application.
 *
 * <p>This class extends the {@code ArithmeticException} and includes a default constructor
 * as well as a constructor that allows specifying the cause of the exception.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 *   try {
 *       // Some code that may throw CalcException
 *   } catch (CalcException e) {
 *       System.out.println("Calculation error: " + e.getMessage());
 *   }
 * }
 * </pre>
 *
 * @see ArithmeticException
 * @see Calculator
 * @author Andriy
 * @version 1.0
 * @since 2023-11-23
 */

public class CalcException extends ArithmeticException {
    
	
	/**
     * Constructs a new {@code CalcException} with the specified detail message.
     *
     * @param cause The cause of the exception.
     */
    public CalcException(String cause)
    {
        super(cause);
    }

}
