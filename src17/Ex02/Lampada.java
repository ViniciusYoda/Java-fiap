package Ex02;

public class Lampada {

	public void testelampada(boolean estado){

	if(estado==true){

	System.out.println("acessa");

	}

	else{

	System.out.println("apagada");

	 }

  }
	class Main {

		public static void main(String[] args)

		{

		Lampada L = new Lampada();

		L.testelampada(false);

		 

		}

		 

		}
}


