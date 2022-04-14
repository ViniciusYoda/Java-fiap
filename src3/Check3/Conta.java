package Check3;

import Check.Contador;

public class Conta {
int contador;
	
	void acrescentar(){
		contador = contador +5;
	}
	
	public int apresentar(){
		return contador;
	}
	
	void zerar(){
		contador = 0;
	}
	
	public static void main(String[] args) {
		Conta contador1 = new Conta();
		
		System.out.println(contador1.apresentar());
		
		contador1.acrescentar();
		System.out.println(contador1.apresentar());
		
		contador1.acrescentar();
		System.out.println(contador1.apresentar());
		
		contador1.acrescentar();
		System.out.println(contador1.apresentar());
		
		contador1.acrescentar();
		System.out.println(contador1.apresentar());
		
		contador1.zerar();
		System.out.println(contador1.apresentar());
	}

}
