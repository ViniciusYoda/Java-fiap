package br.com.fiap.banco1;
/**
 * Classe que abstrai uma Conta Bancária
 * @author vyoda
 * @version 
 */
public class Conta {
	
	//Atributos da Classe
	/**
	 * Número da Conta
	 */
	private int numero;
	/** 
	 * Número da Agencia
	 */
	private int agencia;
	/**
	 * Saldo da Conta
	 */
	private double saldo;
	
	/* Construtores
	 * da Classe Conta
	 */
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSaldo(saldo);
	}
	
	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	
	/** 
	 * verifica o saldo da conta
	 * @return Valor do saldo da cnta
	 */
	
	

}
