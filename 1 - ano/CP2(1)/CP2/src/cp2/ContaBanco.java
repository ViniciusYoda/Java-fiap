package cp2;

public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    private double abrirConta;
    private double depositar;
    private double sacar;
    public double ContaCorrente;
    private double ContaPoupanca;

    
    public void ContaCorrente(double saldo) {
    	ContaCorrente = saldo + 50;
    }
    public void ContaPoupanca(double saldo) {
    	ContaPoupanca = saldo + 150;
    }
   
    public void ContaBanco(int NumConta, String dono) {
    	this.numConta = numConta;
    	this.dono = dono;

    }
    public void estadoAtual(double saldo) {
    	this.numConta = 1234;
    	this.tipo = "ContaPoupanca";
    	this.dono = "Carlos";
    	this.saldo = 0;
    	this.status = false;
    			

    	
    	
    	
    }
    
    public void abrirConta(String t) {
    	if (status = true) {
    		System.out.println("A conta � verdadeira");
    	}else {
    		System.out.println("A conta � falsa");
    	}
    	
		return;
    	
    }
    
    public void fecharConta() {
    	if (saldo <=0) {
    		System.out.println("Imposs�vel encerrar");
    	}
    }
    public void depositar(double depositar) {
    	if (saldo >0 && status == true) {
    		System.out.println("Deposite o dinheiro");
    	}else {
    		System.out.println("Ainda n�o � poss�vel depositar");
    	}
    }
    
    public void sacar(double sacar) {
    	if (numConta > 0 && saldo > 0) {
    		System.out.println("Pode sacar o seu dinheiro");
    	}else {
    		System.out.println("N�o tem dinheiro para sacar");
    	}
    }
    
    public void pagarMensalidade() {
    	if(tipo == "ContaPoupanca") {
    		System.out.println("Dever� pagar 20,00 reais");
    	}else {
    		System.out.println("Dever� pagar 12,00 reais");
    	}
    	
    }
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
	public double getAbrirConta() {
		return abrirConta;
	}
	public void setAbrirConta(double abrirConta) {
		this.abrirConta = abrirConta;
	}
	public double getDepositar() {
		return depositar;
	}
	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}
	public double getSacar() {
		return sacar;
	}
	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
	public double getContaCorrente() {
		return ContaCorrente;
	}
	public void setContaCorrente(double contaCorrente) {
		ContaCorrente = contaCorrente;
	}
	public double getContaPoupanca() {
		return ContaPoupanca;
	}
	public void setContaPoupanca(double contaPoupanca) {
		ContaPoupanca = contaPoupanca;
	}
	
}    



