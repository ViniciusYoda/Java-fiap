public class CursoJava {
	public static void main(String[] args) {
		
		final int numCarros=5;
		Carro[] carros = new Carro[numCarros];
		String[] modelosCarros= {"HRV", "Golf", "Camaro", "Mustang", "IORO", "Touro"};
		
		//inicializar o array carros
		
		for(int i=0;i<numCarros;i++) {
			carros[i]=new Carro(modelosCarros[i]);
		}
		
		//Imprimir Carros
		for(Carro c:carros) {
			c.info();
		}
	}
}
