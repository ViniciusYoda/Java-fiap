package ContaBancaria;

public class ContaBancaria {
	
	//atributos
	private int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//método Construtor
	
	public ContaBancaria() {
		this.setSaldo(0);
		//this.saldo = 0;
		this.setStatus(false);
		//this.status = false;
	}
	
	//métodos operacionais / personalizados
	
	public void abrirConta(String t) {
		this.setTipo(t); //"cc ou cp"
		this.setStatus(true); //ativando  a conta
		if (t.equals("cc")) {
			this.setSaldo(50);
		}else if(t.equals("cp")) {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta possui saldo postivo");
			System.out.println("Saldo: " + this.getSaldo());
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta possui saldo negativo");
			System.out.println("Saldo: " + this.getSaldo());
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso");
		}
	}
	
	public void depositar(float v) {
		if(this.isStatus()) {
			this.saldo += v;
			System.out.println("Depósito realizado na conta de: " + this.getDono());
		}else {
			System.out.println("Não foi possível realizar o depósito");
			System.out.println("Motivo: " + (this.isStatus()? "Conta ativa":"Conta inativa"));
		}
	}
	
	public void sacar(float v) {
		if(this.isStatus()) {
			if (this.getSaldo() >+ v) {
				//saldo -= v;
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
				
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Saque não realizado. Conta inativa");
		}
	}
	
	public void pagarMensalidade() {
		float v = 0; //varoavel local
		//definido o valor da mensalidade
		if(this.tipo.equals("cc")) {
			v = 12;
		}else if(this.tipo.equals("cp")) {
			v = 20;
		}
		
		if(this.isStatus()) {
			this.saldo -= v;
			System.out.println("Obrigado " + this.getDono());
			System.out.println("Mensalidade foi paga com sucesso");
		}else {
			System.out.println("Mensalidade não paga");
			System.out.println("Conta inativa!");
		}
	}
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}
	
	//Getters e Setters

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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
