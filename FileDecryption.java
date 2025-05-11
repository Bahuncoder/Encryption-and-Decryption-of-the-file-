import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

/**
 * The FileDecryption class provides methods to decrypt the contents of a file.
 */
public class FileDecryption {

    /**
     * Decrypts the contents of the input file and writes the decrypted data to the output file.
     * Each character's ASCII code in the input file is decreased by 10 before writing to the output file.
     * 
     * @param inputFile  The name of the input file to be decrypted.
     * @param outputFile The name of the output file where the decrypted data will be written.
     */
    public static void decrypt(String inputFile, String outputFile) {
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

                // Decrypt the content
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    int codeConvert = (int) ch;
                    char c = (char) (codeConvert - 10);
                    outFile.print(c);
                }
                outFile.println();
            }
            keyboard.close();
            outFile.close();
            System.out.println("File decryption completed successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
