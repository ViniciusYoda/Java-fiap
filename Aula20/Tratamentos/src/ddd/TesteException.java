package ddd;

public class TesteException {
    public static void main(String[] args) throws VerificaletraException{
        VerificaException ve = new VerificaException("Fiap");
        
        try {
            ve.VerificaException();
        } catch (Exception e) {
            System.out.println("Letra não encontrada");
            e.getMessage();
        }
    }
}
