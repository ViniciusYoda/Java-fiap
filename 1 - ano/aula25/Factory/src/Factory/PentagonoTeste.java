package Factory;

public class PentagonoTeste {
    public static void main(String[] args) {
        System.out.println(PolignoFactory.getPoligno(3));
        System.out.println(PolignoFactory.getPoligno(4));
        System.out.println(PolignoFactory.getPoligno(5));
    }
}
