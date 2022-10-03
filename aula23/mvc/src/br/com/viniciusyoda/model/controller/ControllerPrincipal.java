package br.com.viniciusyoda.model.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import br.com.viniciusyoda.model.bo.OrdenacaoBO;
import br.com.viniciusyoda.model.vo.Ordenacao;
import br.com.viniciusyoda.view.DialogGerarNumero;
import br.com.viniciusyoda.view.FramePrincipal;

public class ControllerPrincipal implements ActionListener, ChangeListener  {
    private FramePrincipal framePrincipal;
    private DialogGerarNumero dialogGerarNumero;

    public ControllerPrincipal(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        this.framePrincipal.getBtGerarNumero().addActionListener(this);;
        this.framePrincipal.getBtOrdenarNumero().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.framePrincipal.getBtGerarNumero()){
            this.dialogGerarNumero = new DialogGerarNumero();
            ((JSlider) this.dialogGerarNumero.getSlNumeroMaximo).setValue(Integer.parseInt(this.framePrincipal.getTfNumeroMaximo().getText()));

            this.dialogGerarNumero.getBtGerarNumero().addActionListener(this);
            this.dialogGerarNumero.getBtGerarOrdenarNumero().addActionListener(this);
            ((JSlider) this.dialogGerarNumero.getSlNumeroMaximo).addChangeListener(this);

            this.dialogGerarNumero.setVisible(true);

            this.dialogGerarNumero = null;
        }else if (this.dialogGerarNumero != null){
            if(e.getSource() == this.dialogGerarNumero.getBtGerarNumero){
                gerarNumero();
            }else if(e.getSource() == this.dialogGerarNumero.getBtGerarOrdenar()){
                gerarNumero();
                ordenarNumero();
            }
        }
        else if(e.getSource() == this.framePrincipal.getBtOrdenarNumero()){
            ordenarNumero();
        }
        
    }

    @Override
    public void stateChanged(ChangeEvent e){
        if(this.dialogGerarNumero != null) {
            if(e.getSource() == this.dialogGerarNumero.getSlNumeroMaximo()){
                this.framePrincipal.getTfNumeroMaximo().setText(String.valueOf(true));
            }
        }
    }

    private void gerarNumero() {
        limparDadosOrdenacaoAnterior();
        this.dialogGerarNumero.setVisible(false);
        ((AbstractButton) this.framePrincipal.getTfNumeroGerado).setText(String.valueOf((int)(Math.random() * this.dialogGerarNumero.getSlNumeroMaximo().getValue())));

        this.dialogGerarNumero = null;
        ((JComponent) this.framePrincipal.getBtOrdenarNumero).setVisible(true);
    }

    private void ordenarNumero() {
        Ordenacao ordenacao = new OrdenacaoBO().bubbleSort(Integer.parseInt(this.framePrincipal.getTfNumeroGerado().getText()));
        this.framePrincipal.getTfNumeroOrdenado().setText(String.valueOf(ordenacao));
        this.framePrincipal.getTfQtdeTrocas().setText(String.valueOf(ordenacao));
    }

    private void limparDadosOrdenacaoAnterior() {
        this.framePrincipal.getTfNumeroGerado();
    }

   


}
