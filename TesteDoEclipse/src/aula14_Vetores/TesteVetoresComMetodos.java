package aula14_Vetores;

public class TesteVetoresComMetodos {

	public static void main(String[] args) {
		VetoresComMetodos vm = new VetoresComMetodos();
		int t = vm.tamanhoVetor();
		int[] vetor = vm.criaVetor(t);
		vetor = vm.populaVetor(vetor);
		vm.imprimirVetor(vetor);
		
		int num = 3;
		int cont = vm.verificarOcorrências(vetor, num);
		System.out.printf("Ocorrências do número %d: ",num, cont);
	}

}
