package br.com.agenda;

import br.com.controle.ControleCompromisso;
import br.com.models.Compromissos;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mauricio on 24/03/17.
 */
public class ModoAgenda {

	public static void mostrarCompromissosDoMes(ControleCompromisso c){
		List<Compromissos> compromissoss = c.buscarTodos();
		Calendar calendar = Calendar.getInstance();
		int mes = calendar.get(Calendar.MONTH);
		String nomeMes = null;
		if (mes == 1){
			nomeMes = "Janeiro";
		}else if (mes == 2){
			nomeMes = "Fevereiro";
		}else if (mes == 3){
			nomeMes = "Março";
		}else if (mes == 4){
			nomeMes = "Abril";
		}else if (mes == 5){
			nomeMes = "Maio";
		}else if (mes == 6){
			nomeMes = "Junho";
		}else if (mes == 7){
			nomeMes = "Julho";
		}else if (mes == 8){
			nomeMes = "Agosto";
		}else if (mes == 9){
			nomeMes = "Setembro";
		}else if (mes == 10){
			nomeMes = "Outubro";
		}else if (mes == 11){
			nomeMes = "Novembro";
		}else if (mes == 12){
			nomeMes = "Dezembro";
		}
		System.out.println("==========" + nomeMes + "==========");
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).retornarNumeroMes() == mes){
				System.out.println(compromissoss.get(i).retornarDiaDaSemana());
				compromissoss.get(i).mostrar();
			}
		}

	}

	public static void mostrarCompromissosDaSemana(ControleCompromisso c){
		List<Compromissos> compromissoss = c.buscarTodos();
		Calendar calendar = Calendar.getInstance();
		int numeroSemana = calendar.get(Calendar.WEEK_OF_MONTH);
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).retornarNumeroDaSemana() == numeroSemana){
				System.out.println(compromissoss.get(i).retornarDiaDaSemana());
				compromissoss.get(i).mostrar();
			}
		}
	}

	public static void mostrarCompromissosDoDia(ControleCompromisso c){
		List<Compromissos> compromissoss = c.buscarTodos();
		Calendar calendar = Calendar.getInstance();
		int numero = calendar.get(Calendar.DAY_OF_YEAR);
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).retornarNumeroDoDiaDoAno() == numero){
				System.out.println(compromissoss.get(i).retornarDiaDaSemana());
				compromissoss.get(i).mostrar();
			}
		}
	}


}
