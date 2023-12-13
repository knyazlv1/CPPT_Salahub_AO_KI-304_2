
package ki304.salahub.Lab5;
/**
 * The {@code Equations} class provides methods for calculating mathematical equations.
 * It includes a method to calculate the result of a trigonometric equation involving tangent.
 *
 * <p>The class handles special cases, such as division by zero and illegal values of X for tangent calculation.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 *   try {
 *       Equations equations = new Equations();
 *       double result = equations.calculate(45);
 *       System.out.println("Result: " + result);
 *   } catch (CalcException e) {
 *       System.out.println("Calculation error: " + e.getMessage());
 *   }
 * }
 * </pre>
 *
 * @see CalcException
 * @see Math
 * @author Andriy
 * @version 1.0
 * @since 2023-11-23
 * 
 **/
public class Equations {

    /**
     * Calculates the result of a trigonometric equation involving tangent based on the input value of X.
     *
     * @param x The input value for the equation in degrees.
     * @return The result of the equation.
     * @throws CalcException If an arithmetic error occurs during the calculation.
     */
    public double calculate(double x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            double numerator = Math.tan(rad);
            double denominator = Math.sin(4 * rad) - 2 * Math.cos(rad);

            // Check for division by zero
            if (denominator == 0) {
                throw new ArithmeticException();
            }

            y = numerator / denominator;

            // Check if the result is NaN or Infinite, or if x is a special case
            if (Double.isNaN(y) || Double.isInfinite(y) || x == 90 || x == -90) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ex) {
            // Create a higher-level exception with an explanation of the error cause
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0) {
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            } else {
                throw new CalcException("Unknown reason for the exception during equation calculation");
            }
        }
        return y;
    }
}

