package novidades;

public class ContinuaOsErros {
	int[] array = new int[2];
	
	try {
		//Tenta acessar uma posição inexistente do vetor
		array[2] = 10;
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Mensagem de erro " + e.getMessage());
		e.printStackTrace();
	}
}
