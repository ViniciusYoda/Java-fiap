package aula12_heranca;

public class Honda extends Carro {
	
	private String motor;
	
	//Construtor padrão
	public Honda() {
		
	}
	
	public Honda(String motor, String modelo, double preco) {
		super(modelo, preco);
		this.setMotor(motor);
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
}
