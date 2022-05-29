package aula12;

public class Peixe extends Animal {
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som");
		
	}
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

}
