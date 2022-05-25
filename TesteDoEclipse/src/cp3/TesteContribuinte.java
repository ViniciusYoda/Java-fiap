package cp3;

public class TesteContribuinte {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica("Paulo", 1600, "123.123.123.23");
		PessoaFisica p2 = new PessoaFisica("aulo", 1400, "123.123.123.23");
		PessoaFisica p3 = new PessoaFisica("ulo", 5400, "123.123.123.23");
		
		PessoaJuridica p4 = new PessoaJuridica("Lo", 500000, "66.666.666.6.6");
		PessoaJuridica p5 = new PessoaJuridica("Lo", 500000, "66.666.666.6.6");
		PessoaJuridica p6 = new PessoaJuridica("Lo", 500000, "66.666.666.6.6");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(int i=0; i<contribuintes.length; i++) {
			System.out.println(contribuintes[i].toString());
		}

	}

}
