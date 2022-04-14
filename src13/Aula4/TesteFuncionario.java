package Aula4;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();


		f1.setNome("Beatriz");
		f1.setDepto("Compras");
		f1.setAdmissao("13/4/22");
		f1.setRG("1.123.321-8");
		f1.setSalario(6000.00);
		//f1.setSalario(novoSalario);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Paulo");
		f2.setDepto("Vendas");
		f2.setSalario(5000.00);
		
		System.out.println("Func 1: " + f1.getNome());
		System.out.println("Depto: " + f1.getDepto());
		System.out.println("Salário: " + f1.getSalario());
		double novoSalario = f1.aumentarSalario(10);
		System.out.println("Novo Salario: " + novoSalario);
		//System.out.println("Salario: " + f1.getSalario());
		System.out.println("============================");
		
		System.out.println("Func 2: " + f2.getNome());
		System.out.println("Depto: " + f2.getDepto());
		System.out.println("Salário: " + f2.getSalario());
		double novoSalario1 = f2.aumentarSalario(20);
		System.out.println("Novo Salario: " + novoSalario1);
		
		double r = f2.calculoGanhoReal(novoSalario);
		System.out.println("Ganho: " + r);

	}

}
