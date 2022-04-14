package cp1;

public class Conta {

	String nomeCliente = "Bruno";
	int numConta = 5673;
	double saldo = 65;
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public static void main(String[] args) {
		Conta c = new Conta();
		System.out.println("Nome: " + c.getNomeCliente());
		System.out.println("Conta: " + c.getNumConta());
		System.out.println("Saldo: " + c.getSaldo());
		c.depositar(1000);
		System.out.println("Saldo: " + c.saldo);
		c.sacar(500);
		System.out.println("Saldo: " + c.saldo);
	}
	
}
