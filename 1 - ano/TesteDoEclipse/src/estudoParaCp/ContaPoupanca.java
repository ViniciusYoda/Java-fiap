package estudoParaCp;

public class ContaPoupanca extends ContaBancaria{
	
	private double dia_de_rendimento;

	public double getDia_de_rendimento() {
		return dia_de_rendimento;
	}

	public void setDia_de_rendimento(int dia_de_rendimento) {
		this.dia_de_rendimento = dia_de_rendimento;
	}
	
	public void calcularSaldo() {
		this.dia_de_rendimento = saldo * 0.8;
	}
}
