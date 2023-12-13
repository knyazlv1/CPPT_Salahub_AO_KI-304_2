package ki304.salahub.Lab3;
/**
 * The {@code Copy} interface represents an object that can perform copying operations,
 * such as changing the cartridge. Classes implementing this interface should provide
 * functionality related to copying processes.
 *
 * <p>Implementations of this interface should include the {@link #changeCartridge()} method
 * to specify how the cartridge is changed during the copying process.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 *   // Create an instance of a class implementing Copy interface
 *   Copy copier = new CopyImpl();
 *
 *   // Change the cartridge
 *   copier.changeCartridge();
 * }
 * </pre>
 *
 * @see Copy#changeCartridge()
 * @author Andriy
 * @version 1.0
 * @since 2023-11-23
 */
public interface Copy {
	   /**
     * Changes the cartridge used in the copying process. Implementing classes should
     * define the specific behavior for cartridge replacement.
     */
	void changeCardrige();

}
