package aula11_Construtores;

public class Usuario {
	
	//atributos da classe Usuário
	private String usuario; //usuário define
	private String user; //"armazenado"
	private int senha; //usuário define
	private int pwd; //"armazenda"
	
	//Construtpr
	public Usuario() {
		
		System.out.println("+-- Construtor Usuário --+");
		
		user = "Teste123";
		pwd = 123;
	}
	
	public boolean validarUsuario(String user, int pwd, String usuario, int senha) {
		
		System.out.println("+-- Validação de Usuário --+");
		
		if(user.equals(usuario) && (pwd == senha)) {
			return true;
		}else {
			return false;
		}

	}
	
	public void imprimirStatus(boolean status) {
		System.out.println("+-- Imprime Status --+");
		if(status == true) {
			System.out.println("Login efetuado com sucesso!!!");
		}else {
			System.out.println("Tente novamente...");
		}
	}
	
	public int obterSenha() {
		return senha;
	}
	
	public void alterarSenha(int senha) {
		this.senha = senha;
	}
	//getPwd()
	public int obterPwd() {
		return pwd;
	}
	//setPwd()
	public void alterarPwd(int pwd) {
		this.pwd = pwd;
	}
	
	public String obterUsuario() {
		return usuario;
	}
	
	public void alterarUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String obterUser() {
		return user;
	}
	
	public void alterarUser(String user) {
		this.user = user;
	}
}
