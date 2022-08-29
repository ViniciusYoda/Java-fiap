package cp4;

/**
 * 
 * @author Vinícius Yoda
 *
 */

public class Produto {
	private int codigo;
	private String descricao;
	private float preco_unitario;
	
	/**
	 * 
	 * @param codigo do produto
	 * @param descricao do produto
	 * @param preco_unitario do produto
	 */
	
	public Produto(int c, String d, float pu) {
		this.codigo = c;
		this.descricao = d;
		this.preco_unitario = pu;
		
	}
	
	/**
	 *  Método de escrita
	 */

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco_unitario=" + preco_unitario
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(float preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	
	
	
	
}
