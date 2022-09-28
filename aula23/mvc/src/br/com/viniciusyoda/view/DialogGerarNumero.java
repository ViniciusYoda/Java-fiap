package br.com.viniciusyoda.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class DialogGerarNumero extends JDialog {

	private JLabel lbNumeroMaximo; // rótulo
	private JButton btGerar; // botão
	private JButton btGerarOrdenar;
	private JSlider slNumeroMaximo;
	
	public DialogGerarNumero() {
		this.setSize(300, 205);
		this.setLocationRelativeTo(null);
		this.setTitle("Gerar número Randômico");
		this.setModal(true);
		this.setLayout(null);
		this.setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		this.lbNumeroMaximo = new JLabel("Número máximo da sequência");
		
		this.slNumeroMaximo = new JSlider(1, 99999);
		this.slNumeroMaximo.setMajorTickSpacing(99999); 
		this.slNumeroMaximo.setPaintTicks(true);
		
		this.btGerar = new JButton("Gerar número");
		this.btGerarOrdenar = new JButton("Gerar e Ordenar");
		
		this.lbNumeroMaximo.setBounds(20, 20, 200, 20);
		this.slNumeroMaximo.setBounds(20, 50, 245, 30);
		this.btGerar.setBounds(70, 90, 150, 25);
		this.btGerarOrdenar.setBounds(70, 125, 150, 25);
		
		this.add(lbNumeroMaximo);
		this.add(slNumeroMaximo);
		this.add(btGerar);
		this.add(btGerarOrdenar);
		
	}

	/**
	 * @return the lbNumeroMaximo
	 */
	public JLabel getLbNumeroMaximo() {
		return lbNumeroMaximo;
	}

	/**
	 * @param lbNumeroMaximo the lbNumeroMaximo to set
	 */
	public void setLbNumeroMaximo(JLabel lbNumeroMaximo) {
		this.lbNumeroMaximo = lbNumeroMaximo;
	}

	/**
	 * @return the btGerar
	 */
	public JButton getBtGerar() {
		return btGerar;
	}

	/**
	 * @param btGerar the btGerar to set
	 */
	public void setBtGerar(JButton btGerar) {
		this.btGerar = btGerar;
	}

	/**
	 * @return the btGerarOrdenar
	 */
	public JButton getBtGerarOrdenar() {
		return btGerarOrdenar;
	}

	/**
	 * @param btGerarOrdenar the btGerarOrdenar to set
	 */
	public void setBtGerarOrdenar(JButton btGerarOrdenar) {
		this.btGerarOrdenar = btGerarOrdenar;
	}

	/**
	 * @return the slNumeroMaximo
	 */
	public JSlider getSlNumeroMaximo() {
		return slNumeroMaximo;
	}

	/**
	 * @param slNumeroMaximo the slNumeroMaximo to set
	 */
	public void setSlNumeroMaximo(JSlider slNumeroMaximo) {
		this.slNumeroMaximo = slNumeroMaximo;
	}
	
	
}
