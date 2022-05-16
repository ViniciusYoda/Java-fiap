package Exemplo2;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado e = new Empregado() {
			
			@Override
			public double vencimento() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		e.setNome("Bruno");
		e.setSobrenome("Carretão");
		e.setCpf("102.934.567-09");
		System.out.println("O empregado: " + e.getNome() + " " +  e.getSobrenome() + " com seu cpf: " + e.getCpf());
		
	}
}
