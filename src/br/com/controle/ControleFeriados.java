package br.com.controle;

import br.com.models.Data;
import br.com.models.Feriados;

import java.util.List;

/**
 * Created by mauricio on 20/03/17.
 */
public class ControleFeriados {
	Data diaTiradentes = new Data("21/04/2017");
	Data diaNossaSenhoraDeAssuncao = new Data("15/08/2017");
	private Feriados[] feriados = {
			new Feriados("Dia de Tiradentes", diaTiradentes, true),
			new Feriados("Dia de Nossa Senhora de Assunção", diaNossaSenhoraDeAssuncao, false),
	};

	public Feriados[] buscarTodos(){
		return feriados;
	}

}
