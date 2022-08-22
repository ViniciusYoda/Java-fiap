import java.util.ArrayList;

public class Lista04 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(7);
        numeros.add(9);
        numeros.add(5);

        for (Integer numero : numeros) {
            System.out.println(numeros.get(numero));
        }
    }

}
