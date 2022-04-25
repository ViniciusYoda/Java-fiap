package aula11_Construtores;

import java.util.Scanner;

public class TesteUsuario {
	public static void main(String[] args) {
		//criando um objeto Scanner
	    Scanner input = new Scanner(System.in);
	    //entrada de dados pelo teclado
	    System.out.println("Usuário: ");
	    String login = input.next();
	    System.out.println("Senha: ");
	    int passwoed = input.nextInt();
		
		//criando um objeto Usuario
		Usuario user1 = new Usuario();
		//testando os valores dos atributos
		String user, usuario;
		int pwd, senha;
		
		
		
		user1.alterarUsuario("Teste123");
		user1.alterarSenha(123);
		
		String user1 = user1.obterUser();
		int pwd1 = user1.obterPwd();
		String usuario = user1.obterUsuario();
		int senha = user1.obterSenha();
		
		boolean status = user1.validarUsuario(user1, pwd1, usuario, senha);
		user1.imprimirStatus(status);
	}
}
