package Conta;
public class ContaBanco {
	//Atribunto
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadodAtual() {
		System.out.println("Conta " + this.getNumConta());
		System.out.println("Dono " + this.getDono());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.isStatus());
	}
	
	//Métodos
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		}else if (tipo == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta sberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}else if(this.getSaldo() < 0){
			System.out.println("Conta em debito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	
	public void depositar(float v) {
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
		}else {
			System.out.println("Impossivel depositar");
		}
	}
	
	public void sacar(float v) {
		if (this.isStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque na conta de: " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossivel sacar");
		}
	}
	
	public void pagarMensalidade() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		}else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.isStatus()) {
			if (this.getSaldo() > v ) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensaldiade paga por: " + this.getDono());
			}else {
				System.out.println("Impossivel de pagar");
			}
		}
	}
	
	//Construtor
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	//Get e Set
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
