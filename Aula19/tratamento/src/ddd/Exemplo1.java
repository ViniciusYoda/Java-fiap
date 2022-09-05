package ddd;

public class Exemplo1 {
    public static void main(String[] args) {
        int a, b, result;

        try {
            a = 42;
            b = 0;
            result = a / b;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println("Divisão por zero");
        }
        System.out.println("Fora do try-catch");

        
        
    }
}