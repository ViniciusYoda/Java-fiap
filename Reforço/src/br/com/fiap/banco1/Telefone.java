package br.com.fiap.banco1;

public class Telefone {
	private String ddd;
	private String numero;
	
	//m�todos gets e sets
	
	public String getTelefoneFormatado() {
		return formatarTelefone(ddd,numero);
	}
	
	private String formatarTelefone(String ddd, String numero) {
		return "(" + ddd + ")" + numero;
	}
}
