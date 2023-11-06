package lab1;
import java.io.*;
import java.util.Scanner;

/**
 * This program allows the user to create a square matrix with customizable fillers
 * and saves the matrix to a text file.
 */
public class Lab1SalahubKI304 {

    /**
     * The main method of the program.
     *
     * @param args Command line arguments (not used in this program).
     * @throws FileNotFoundException If the specified file is not found.
     */
    public static void main(String[] args) throws FileNotFoundException {

        int nRows = 0; 
        

        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Get the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        while (nRows < 5) {
            if (nRows < 5) {
                System.out.println("Enter a number greater than or equal to 5: ");
            }
            nRows = in.nextInt();
        }

        in.nextLine();
        
        // Create a jagged  arr of characters
        char[][] arr = new char[nRows][];
        
        System.out.print("\nEnter symbol filler: ");
        String filler = in.nextLine();

        // Fill the matrix with symbols
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[nRows]; // Each row may have a different length
            for (int j = 0; j < nRows; j++) {
                if (filler.length() == 1) {
                    if (i == 0 || i == nRows - 1 || j == 0 || j == nRows - 1) {
                        arr[i][j] = filler.charAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    } else if (i == 1 || i == nRows - 2 || j == 1 || j == nRows - 2) {
                        arr[i][j] = 0;
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    } else {
                        arr[i][j] = filler.charAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    }
                } else if (filler.length() == 0) {
                    System.out.print("\nNot entered symbol filler");
                    break;
                } else {
                    System.out.print("\nToo many symbols for filler");
                    break;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
