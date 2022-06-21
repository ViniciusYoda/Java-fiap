package aula14;



public class Aula14 {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de POO");
		v[2] = new Video("Aula 10 de POO");
		System.out.println(v[0].toString());
		
		Usuario u[] = new Usuario[2];
		u[0] = new Usuario("JUblieu", 22, "M", "juba");
		u[1] = new Usuario("Creuza", 12, "F", "creuzita");
		System.out.println(u[0].toString());
		
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(u[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(u[0], v[1]);
		vis[1].avaliar(35);
		System.out.println(vis[0].toString());
	}
}
