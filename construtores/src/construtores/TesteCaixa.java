package construtores;

public class TesteCaixa {
	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		System.out.println(c1);
		System.out.println("Altura: " + c1.getAltura());
		System.out.println("Largura: " + c1.getLargura());
		System.out.println("Profundidade: " + c1.getProfundidade());
		System.out.println("Volume: " + c1.volumeCaixa());
	}

}
