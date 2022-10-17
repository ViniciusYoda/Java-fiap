package Factory;

public class PolignoFactory {
    public static Poligno getPoligno(int numeroLados){
        if(numeroLados == 3){
            System.out.println("Triângulo criado");
            return new Triangulo();
        }else if (numeroLados == 4){
            System.out.println("Quadrado criado");
            return new Quadrado();
        }else if (numeroLados == 5) {
            System.out.println("Pentagono criado");
            return new Pentagono();
        }
        return null;
    }
}
