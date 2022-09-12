package ddd;

public class VerificaException {
    private String texto;

    public VerificaException(String t) {
        texto = t;
    }

    /**
     * @throws VerificaletraException
     */
    public void VerificaException() throws VerificaletraException{
        if(!texto.contains("F") || !texto.contains("f")){
            throw new VerificaletraException();
        } else {
            System.out.println("Letra encontrada");
        }
    }
}