/**
 * The FileNotFoundException class represents an exception that is thrown when a file is not found.
 * This exception is typically thrown by methods that attempt to access a file that does not exist.
 */
class FileNotFoundException extends Exception {
    /**
     * Constructs a new FileNotFoundException with the specified detail message.
     * 
     * @param message The detail message (which is saved for later retrieval by the getMessage() method).
     */
    public FileNotFoundException(String message) {
        super(message);
    }
}
