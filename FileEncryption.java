import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * The FileEncryption class provides methods to encrypt the contents of a file.
 */
public class FileEncryption {
    /**
     * Encrypts the contents of the input file and writes the encrypted data to the output file.
     * Each character's ASCII code in the input file is increased by 10 before writing to the output file.
     * 
     * @param inputFile  The name of the input file to be encrypted.
     * @param outputFile The name of the output file where the encrypted data will be written.
     */
    public static void encrypt(String inputFile, String outputFile) {
        try {
            // Create an input file to read the content
            File inFile = new File(inputFile);
            if (!inFile.exists()) {
                throw new FileNotFoundException("Input file not found.");
            }

            Scanner keyboard = new Scanner(inFile);

            // Create an output file to display output
            PrintWriter outFile = new PrintWriter(outputFile);

            // Read lines from the file until no more are left
            while (keyboard.hasNext()) {
                String str = keyboard.nextLine();

                // Add 10 to the ASCII code of each character
                // before it is written to the second file
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    int code = (int) ch;
                    char c = (char) (code + 10);

                    outFile.print(c);
                }
                outFile.println();
            }
            keyboard.close();
            outFile.close();
            System.out.println("File encryption completed successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
