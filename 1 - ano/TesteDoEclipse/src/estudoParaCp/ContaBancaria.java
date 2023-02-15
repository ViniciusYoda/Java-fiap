package estudoParaCp;

public class ContaBancaria {
	private String cliente;
	private int num_conta;
	protected float saldo;
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void sacar(double sacar) {
		if(saldo <= 0) {
			System.out.println("Não é possível sacar, saldo zerado");
		}else {
			System.out.println("Saque o dinheiro");
		}
	}
	
	public float depositar(double depositar) {
		return saldo -= saldo;
	}
	
}
