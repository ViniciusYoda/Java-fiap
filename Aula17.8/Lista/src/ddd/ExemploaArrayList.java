package ddd;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploaArrayList {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("BMW");
        carros.add("Volvo");
        carros.add("Mercedes");
        carros.add("Ford");
        carros.add("Fiat");
        System.out.println(carros);

        // Criando arrayList de números

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // adicionando números na lista

        numeros.add(5);
        numeros.add(-3);
        numeros.add(10);
        numeros.add(200);
        numeros.add(2000);

        System.out.println(numeros);

       for (Integer e : numeros) {
        System.out.println(e);
       }

       for(int i = 0; i < numeros.size(); i++){
        System.out.printf("%d: %d\n", i+1, numeros.get(i));
       }

       System.out.println("==========================================");
       System.out.println("Ordenando a lista...");
       Collections.sort(numeros);
       System.out.println(numeros);
       Collections.sort(carros);
       System.out.println(carros);

       System.out.println("==========================================");
       // Criando uma lista heterogenea (sem uso de generica)
       ArrayList listaHet = new ArrayList();
       listaHet.add(10); // Integer
       listaHet.add(true); // Boolean
       listaHet.add("FIAP"); // String

       System.out.println(listaHet);

       if (listaHet.isEmpty()){
        System.out.println("Lista vazia");
       } else {
        System.out.println(listaHet);
        }
    }

}
