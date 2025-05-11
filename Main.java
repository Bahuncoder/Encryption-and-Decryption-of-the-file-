/**
 * Description:This class serves as the entry point for testing the file encryption and decryption functionality.
 * It tests the encryption and decryption processes by calling the respective methods from FileEncryption and FileDecryption classes.
 * 
 * Class: Fall - COSC 1437.82002
 * Assignment10: encryption and decryption of the file 
 * Date: 05/03/2024
 * 
 * @author Sudip Paudel
 * @version 0.0
 */
public class Main {
    /**
     * The main method of the program.
     * It tests the encryption and decryption processes by calling the respective methods from FileEncryption and FileDecryption classes.
     * 
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String args[]) {
        // Test encryption
        FileEncryption.encrypt("InputFile.txt", "EncryptedOutputFile.txt");

        // Test decryption
        FileDecryption.decrypt("EncryptedOutputFile.txt", "DecryptedOutputFile.txt");
    }
}
