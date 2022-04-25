package construtores;

public class TesteCaixa {
	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		System.out.println("Volume c1: " + c1.volumeCaixa());
		
		System.out.println("================================");
		Caixa c2 = new Caixa(10, 20, 15);
		System.out.println("Volume c2: " + c2.volumeCaixa());
		
		System.out.println("================================");
		Caixa c3 = new Caixa();
		c3.entradaDados();
		System.out.println("Volume c3: " + c3.volumeCaixa());
		
		System.out.println("================================");
		
		double l, a, p;
		System.out.println("Largura: ");
		l = c1.entradaDados2();
		System.out.println("Altura: ");
		a = c1.entradaDados2();
		System.out.println("Profundidade: ");
		p = c1.entradaDados2();
		
		Caixa c4 = new Caixa(l, a, p);
		System.out.println("Volume c4: " + c4.volumeCaixa());
		
		
		
	}

}
