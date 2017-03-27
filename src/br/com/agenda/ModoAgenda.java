package br.com.agenda;

import br.com.controle.ControleAniversario;
import br.com.controle.ControleCompromisso;
import br.com.controle.ControleFeriados;
import br.com.controle.ControleTarefas;
import br.com.models.Aniversario;
import br.com.models.Compromissos;
import br.com.models.Feriados;
import br.com.models.Tarefas;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mauricio on 24/03/17.
 */
public class ModoAgenda {

	public static void mostrarCompromissosDoMes(ControleCompromisso c, ControleTarefas ct, ControleFeriados cf, ControleAniversario ca){
		List<Compromissos> compromissoss = c.buscarTodos();
		List<Tarefas> tarefass = ct.buscarTodos();
		Feriados[] feriadoss = cf.buscarTodos();
		List<Aniversario> aniversarios = ca.buscarTodos();
		Calendar calendar = Calendar.getInstance();
		int mes = calendar.get(Calendar.MONTH);
		String nomeMes = null;
		if (mes == 0){
			nomeMes = "Janeiro";
		}else if (mes == 1){
			nomeMes = "Fevereiro";
		}else if (mes == 2){
			nomeMes = "Março";
		}else if (mes == 3){
			nomeMes = "Abril";
		}else if (mes == 4){
			nomeMes = "Maio";
		}else if (mes == 5){
			nomeMes = "Junho";
		}else if (mes == 6){
			nomeMes = "Julho";
		}else if (mes == 7){
			nomeMes = "Agosto";
		}else if (mes == 8){
			nomeMes = "Setembro";
		}else if (mes == 9){
			nomeMes = "Outubro";
		}else if (mes == 10){
			nomeMes = "Novembro";
		}else if (mes == 11){
			nomeMes = "Dezembro";
		}
		System.out.println("==========" + nomeMes + "==========");
		System.out.println("==========COMPROMISSOS=========");
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).retornarNumeroMes() == mes){
				System.out.println(compromissoss.get(i).retornarDiaDaSemana());
				compromissoss.get(i).mostrar();
			}
		}
		System.out.println("=======TAREFAS========");
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).retornarNumeroMes() == mes){
				System.out.println(tarefass.get(i).retornarDiaDaSemana());
				tarefass.get(i).mostrar();
			}
		}
		System.out.println("========FERIADOS========");
		for (Feriados feriados: feriadoss) {
			if (feriados.retornarNumeroMes() == mes){
				System.out.println(feriados.retornarDiaDaSemana());
				feriados.mostrar();
			}
		}
		System.out.println("=======ANIVERSÁRIOS=======");
		for (Aniversario aniversario:aniversarios) {
			if (aniversario.retornarNumeroMes() == mes){
				System.out.println(aniversario.retornarDiaDaSemana());
				aniversario.mostrar();
			}
		}

	}

	public static void mostrarCompromissosDaSemana(ControleCompromisso c, ControleTarefas ct, ControleFeriados cf, ControleAniversario ca){
		List<Compromissos> compromissoss = c.buscarTodos();
		List<Tarefas> tarefass = ct.buscarTodos();
		Feriados[] feriadoss = cf.buscarTodos();
		List<Aniversario> aniversarios = ca.buscarTodos();
		Calendar calendar = Calendar.getInstance();
		int numeroSemana = calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println("==========COMPROMISSOS=========");
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).retornarNumeroDaSemana() == numeroSemana){
				System.out.println(compromissoss.get(i).retornarDiaDaSemana());
				compromissoss.get(i).mostrar();
			}
		}
		System.out.println("=======TAREFAS========");
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).retornarNumeroDaSemana() == numeroSemana){
				System.out.println(tarefass.get(i).retornarDiaDaSemana());
				tarefass.get(i).mostrar();
			}
		}
		System.out.println("========FERIADOS========");
		for (Feriados feriado : feriadoss) {
			if (feriado.retornarNumeroDaSemana() == numeroSemana){
				System.out.println(feriado.retornarDiaDaSemana());
				feriado.mostrar();

			}
		}
		System.out.println("=======ANIVERSÁRIOS=======");
		for (Aniversario aniversario : aniversarios) {
			if (aniversario.retornarNumeroDaSemana() == numeroSemana){
				System.out.println(aniversario.retornarDiaDaSemana());
				aniversario.mostrar();
			}
		}
	}

	public static void mostrarCompromissosDoDia(ControleCompromisso c, ControleTarefas ct, ControleFeriados cf, ControleAniversario ca){
		List<Compromissos> compromissoss = c.buscarTodos();
		List<Tarefas> tarefass = ct.buscarTodos();
		Feriados[] feriadoss = cf.buscarTodos();
		List<Aniversario> aniversarios = ca.buscarTodos();
		Calendar calendar = Calendar.getInstance();
		int numero = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("==========COMPROMISSOS=========");
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).retornarNumeroDoDiaDoAno() == numero){
				System.out.println(compromissoss.get(i).retornarDiaDaSemana());
				compromissoss.get(i).mostrar();
			}
		}
		System.out.println("=======TAREFAS========");
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).retornarNumeroDoDiaDoAno() == numero){
				System.out.println(tarefass.get(i).retornarDiaDaSemana());
				tarefass.get(i).mostrar();
			}
		}
		System.out.println("========FERIADOS========");
		for (Feriados feriados:feriadoss) {
			if (feriados.retornarNumeroDoDiaDoAno() == numero){
				System.out.println(feriados.retornarDiaDaSemana());
				feriados.mostrar();
			}
		}
		System.out.println("=======ANIVERSÁRIOS=======");
		for (Aniversario aniversario:aniversarios) {
			if (aniversario.retornarNumeroDoDiaDoAno() == numero){
				System.out.println(aniversario.retornarDiaDaSemana());
				aniversario.mostrar();
			}
		}
	}


}
