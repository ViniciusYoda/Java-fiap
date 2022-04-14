package Check;

public class Contador { 
	private int valor;

public Contador() { valor = 0 ; }

public int zera() { this.valor = 0; return valor; }

public int incrementa() { this.valor++; return valor; }

public int retornar() {

return valor = valor - valor; } 


public static void main(String[]args){
Contador contador = new Contador();

contador.zera();
System.out.println("Zerando o contador : " + contador.zera() );

System.out.println("Incrementando valor : " + contador.incrementa() );

contador.retornar();
System.out.println("Retornando Valor : " +contador.retornar() );
}


	}