package ddd;

/**
 * VerificaletraException
 */
public class VerificaletraException extends Exception {

    /* (non-Javadoc)
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return "Letra não encontrada!";
    }
    
}