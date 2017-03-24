package br.com.agenda;

import br.com.controle.ControleCompromisso;
import br.com.models.Compromissos;

import java.util.List;

/**
 * Created by mauricio on 24/03/17.
 */
public class FormularioAgenda {

	public static void agenda(ControleCompromisso c){
		List<Compromissos> compromissos = c.buscarTodos();
		System.out.println("=========Janeiro===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("janeiro")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Fevereiro===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("fevereiro")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Março===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("março")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Abril===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("abril")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Maio===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("maio")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Junho===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("junho")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Julho===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("julho")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Agosto===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("agosto")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Setembro===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("setembro")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Outubro===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("outubro")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Novembro===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("novembro")) {
				semana(c, compromissos);
			}
		}

		System.out.println("=========Dezembro===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getMes().equals("dezembro")) {
				semana(c, compromissos);
			}
		}
	}

	public static void semana(ControleCompromisso c, List<Compromissos> compromissos){
		System.out.println("=========Segunda===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getDiaDaSemana().equals("segunda")) {
				compromissos.get(i).mostrar();
			}
		}

		System.out.println("=========Terça===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getDiaDaSemana().equals("terça")) {
				compromissos.get(i).mostrar();
			}
		}

		System.out.println("=========Quarta===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getDiaDaSemana().equals("quarta")) {
				compromissos.get(i).mostrar();
			}
		}

		System.out.println("=========Quinta===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getDiaDaSemana().equals("quinta")) {
				compromissos.get(i).mostrar();
			}
		}

		System.out.println("=========Sexta===========");
		for (int i = 0; i < compromissos.size(); i++) {
			if (compromissos.get(i).getDataInicio().getDiaDaSemana().equals("sexta")) {
				compromissos.get(i).mostrar();
			}
		}
	}
}
