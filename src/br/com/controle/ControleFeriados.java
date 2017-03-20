package br.com.controle;

import br.com.models.Feriados;

import java.util.List;

/**
 * Created by mauricio on 20/03/17.
 */
public class ControleFeriados {
	private Feriados[] feriados = {
			new Feriados("Dia de Tiradentes", "21 de abril", true),
			new Feriados("Dia de Nossa Senhora de Assunção", "15 de agosto", false),
	};

	public Feriados[] buscarTodos(){
		return feriados;
	}

}
