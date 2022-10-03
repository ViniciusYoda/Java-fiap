package br.com.viniciusyoda;

import br.com.viniciusyoda.model.bo.OrdenacaoBO;
import br.com.viniciusyoda.model.controller.ControllerPrincipal;
import br.com.viniciusyoda.model.vo.Ordenacao;
import br.com.viniciusyoda.view.FramePrincipal;

public class MVC {
	public static void main(String[] args) {
		FramePrincipal framePrincipal = new FramePrincipal();
		new ControllerPrincipal(framePrincipal);
		framePrincipal.setVisible(true);
	}
}
