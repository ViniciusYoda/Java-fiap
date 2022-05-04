package ContaBancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria p1 = new ContaBancaria();
		p1.estadoAtual();
		p1.setDono("José");
		p1.abrirConta("cc");
		p1.setNumConta(1111);
		p1.estadoAtual();
		p1.depositar(500);
		System.out.println("Saldo: " + p1.getSaldo());
		p1.sacar(2000);
		

	}

}
