package cp4;

public class Produto {
	
	private int codigo;
	private String descricao;
	private float precoUnitario;
	
	/**
	 * @param codigo
	 * @param descricao
	 * @param precoUnitario
	 */
	public Produto(int codigo, String descricao, float precoUnitario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the precoUnitario
	 */
	public float getPrecoUnitario() {
		return precoUnitario;
	}

	/**
	 * @param precoUnitario the precoUnitario to set
	 */
	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	/**
	 * @return Retorna as informações de um produto
	 */

	public String toString() {
		return "Cóigo: " + getCodigo() + "|" + "Descrição: " + getDescricao() + "Preço: " + getPrecoUnitario();
	}

	
}
