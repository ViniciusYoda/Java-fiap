package br.com.fiap.banco1;

public class ContaCorrente extends Conta {
	private String tipo;
	
	public ContaCorrente(int numero, String tipo) {
		super(numero);
		this.tipo = tipo;
	}
	
	private double chequeEspecial;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
		}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getSaldoDisponivel() {
		return getSaldo() + this.chequeEspecial;
	}
	
	@Override
	public void retirar(double valor){
		valor = valor + 10;
		super.retirar(valor);
	}
}


