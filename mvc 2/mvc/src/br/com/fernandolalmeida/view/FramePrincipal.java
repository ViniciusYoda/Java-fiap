package br.com.fernandolalmeida.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class FramePrincipal extends JFrame{
	
	private JLabel lbNumeroMaximo;
	private JLabel lbNumeroGerado;
	private JLabel lbNumeroOrdenado;
	private JLabel lbQtdeTrocas;
	private JTextField tfNumeroMaximo;
	private JTextField tfNumeroGerado;
	private JTextField tfNumeroOrdenado;
	private JTextField tfQtdeTrocas;
	private JTextPane tpInformacao;
	private JScrollPane spRolagemPassos;
	private JButton btGerarNumero;
	private JButton btOrdenarNumero;
	
	public FramePrincipal() {
		
		this.setTitle("MVC");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(380, 320);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.lbNumeroMaximo = new JLabel("Número Máximo");
		this.lbNumeroGerado = new JLabel("Número Gerado");
		this.lbNumeroOrdenado = new JLabel("Número Ordenado");
		this.lbQtdeTrocas = new JLabel("Qtde de Trocas");
		
		this.tfNumeroMaximo = new JTextField("1");
		this.tfNumeroMaximo.setEnabled(false);
		this.tfNumeroGerado = new JTextField();
		this.tfNumeroGerado.setEnabled(false);
		this.tfNumeroOrdenado = new JTextField();
		this.tfNumeroOrdenado.setEnabled(false);
		this.tfQtdeTrocas = new JTextField();
		this.tfQtdeTrocas.setEnabled(false);
		
		this.btGerarNumero = new JButton("Gerar número randômico");
		this.btOrdenarNumero = new JButton("Ordenar número gerado");
		this.btOrdenarNumero.setEnabled(false);
		
		this.tpInformacao = new JTextPane();
		this.tpInformacao.setText("Sistema que ordena uma sequênncia de números");
		this.tpInformacao.setEnabled(false);
		this.tpInformacao.setDisabledTextColor(Color.BLACK);
		this.tpInformacao.setOpaque(false);
		
		this.spRolagemPassos = new JScrollPane();
		this.spRolagemPassos.setBorder(null);
		this.spRolagemPassos.setViewportView(this.tpInformacao);
		
		this.lbNumeroMaximo.setBounds(20, 20, 150, 20);
		this.lbNumeroGerado.setBounds(20, 85, 150, 20);
		this.lbNumeroOrdenado.setBounds(20, 150, 150, 20);
		this.lbQtdeTrocas.setBounds(20, 215, 150, 20);
		
		this.tfNumeroMaximo.setBounds(20, 50, 100, 25);
		this.tfNumeroGerado.setBounds(20, 115, 100, 25);
		this.tfNumeroOrdenado.setBounds(20, 180, 100, 25);
		this.tfQtdeTrocas.setBounds(20, 245, 100, 25);
		
		this.btGerarNumero.setBounds(150, 20, 200, 25);
		this.btOrdenarNumero.setBounds(150, 55, 200, 25);
		
		this.spRolagemPassos.setBounds(150, 90, 200, 180);
		
		this.add(lbNumeroMaximo);
		this.add(lbNumeroGerado);
		this.add(lbNumeroOrdenado);
		this.add(lbQtdeTrocas);
		
		this.add(tfNumeroMaximo);
		this.add(tfNumeroGerado);
		this.add(tfNumeroOrdenado);
		this.add(tfQtdeTrocas);
		this.add(btGerarNumero);
		this.add(btOrdenarNumero);
		
		this.add(spRolagemPassos);
	}

	/**
	 * @return the lbNumeroMaximo
	 */
	public JLabel getLbNumeroMaximo() {
		return lbNumeroMaximo;
	}

	/**
	 * @return the lbNumeroGerado
	 */
	public JLabel getLbNumeroGerado() {
		return lbNumeroGerado;
	}

	/**
	 * @return the lbNumeroOrdenado
	 */
	public JLabel getLbNumeroOrdenado() {
		return lbNumeroOrdenado;
	}

	/**
	 * @return the lbQtdeTrocas
	 */
	public JLabel getLbQtdeTrocas() {
		return lbQtdeTrocas;
	}

	/**
	 * @return the tfNumeroMaximo
	 */
	public JTextField getTfNumeroMaximo() {
		return tfNumeroMaximo;
	}

	/**
	 * @return the tfNumeroGerado
	 */
	public JTextField getTfNumeroGerado() {
		return tfNumeroGerado;
	}

	/**
	 * @return the tfNumeroOrdenado
	 */
	public JTextField getTfNumeroOrdenado() {
		return tfNumeroOrdenado;
	}

	/**
	 * @return the tfQtdeTrocas
	 */
	public JTextField getTfQtdeTrocas() {
		return tfQtdeTrocas;
	}

	/**
	 * @return the tpInformacao
	 */
	public JTextPane getTpInformacao() {
		return tpInformacao;
	}

	/**
	 * @return the spRolagemPassos
	 */
	public JScrollPane getSpRolagemPassos() {
		return spRolagemPassos;
	}

	/**
	 * @return the btGerarNumero
	 */
	public JButton getBtGerarNumero() {
		return btGerarNumero;
	}

	/**
	 * @return the btOrdenarNumero
	 */
	public JButton getBtOrdenarNumero() {
		return btOrdenarNumero;
	}
	
	
	
	
	
	
	
	
	
}
