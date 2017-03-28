package br.com.controle;

import br.com.models.Feriados;

/**
 * Created by mauricio and zeky on 20/03/17.
 */
public class ControleFeriados {
	String diaTiradentes = "21/04/2017";
	String diaNossaSenhoraDeAssuncao = "15/08/2017";

	private Feriados[] feriados = {
			new Feriados("Dia de Tiradentes", diaTiradentes, true),
			new Feriados("Dia de Nossa Senhora de Assunção", diaNossaSenhoraDeAssuncao, false),
	};

	public Feriados[] buscarTodos(){
		return feriados;
	}

}
