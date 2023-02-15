package object;

import java.util.Date;

public class Equipe {
	public static void main(String[] args) {
		Funcionario[] equipe = new Funcionario[5];
		
		equipe[0] = new Funcionario("Vinícius", 1, new Date(1,8,2020), new Date(1,8,2020), 1000);
		System.out.println(equipe[0]);
	}
}
