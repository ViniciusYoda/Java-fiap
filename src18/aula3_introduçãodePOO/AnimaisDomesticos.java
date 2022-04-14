package aula3_introduçãodePOO;

public class AnimaisDomesticos {
	
	//Atributos ou variáveis
	String nome;
	String raca;
	int idade;
	float peso;
	String corOlhos;
	char sexo;
	
	//Métodos
	public void andar() {
		System.out.println("ANDAR...");
	}
	
	public void parar() {
		System.out.println("PARAR...");
	}
	
	public void dormir() {
		System.out.println("DORMIR...");
	}
	
	public void latir() {
		System.out.println("LATIR...");
	}
	
	public void comer() {
		System.out.println("COMER...");
	}
	
	public static void main(String args[]) {
		//criação do objeto cachorro1
		AnimaisDomesticos cachorro1 = new AnimaisDomesticos();
		cachorro1.nome = "Pluto";
		cachorro1.corOlhos = "azuis";
		cachorro1.idade = 53;
		cachorro1.peso = 8.5f; //casting para Float
		cachorro1.raca = "Shin-tzu";
		cachorro1.sexo = 'F';
		
		//criação do objeto cachorro2
		
		AnimaisDomesticos cachorro2 = new AnimaisDomesticos();
		cachorro2.nome = "Rex";
		cachorro2.corOlhos = "amarelos";
		cachorro2.idade = 22;
		cachorro2.peso = 10.8f;
		cachorro2.raca = "Pitbull";
		cachorro2.sexo = 'M';
		
		//Imprimindo as informações dos objetos (cachorro1 e cachorro2)
		System.out.println("O nome: " + cachorro1.nome);
		System.out.println("A raça: " + cachorro1.raca);
		System.out.println("A cor dos olhos: " + cachorro1.corOlhos);
		System.out.println("A idade: " + cachorro1.idade);
		System.out.println("O peso: " + cachorro1.peso);
		System.out.println("O sexo: " + cachorro1.sexo);
		System.out.println(""); //pula linha
		System.out.println("O nome: " + cachorro2.nome);
		System.out.println("A raça: " + cachorro2.raca);
		System.out.println("A cor dos olhos: " + cachorro2.corOlhos);
		System.out.println("A idade: " + cachorro2.idade);
		System.out.println("O peso: " + cachorro2.peso);
		System.out.println("O sexo: " + cachorro2.sexo);
		//acesso ao método andar
		cachorro2.andar();
		cachorro2.comer();
		
	}
}
