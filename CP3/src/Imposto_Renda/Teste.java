package Imposto_Renda;

public class Teste {

	public static void main(String[] args) {
	
	PessoaFisica p1 = new PessoaFisica("Averlan", 5000); 
	
	PessoaJuridica p2 = new PessoaJuridica("Vinícius", 300000);
	
	p1.calcularImposto();
	p2.calcularImposto();
	
	System.out.println("Total a paga de impostos R$: " + p1.calcularImposto());
	
	System.out.println("Total a paga de impostos R$: " + p2.calcularImposto());
	

	}

}
