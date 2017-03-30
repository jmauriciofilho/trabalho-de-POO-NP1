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
		int cont1 = 0;
		for (Compromissos compromisso : compromissoss){
			if (compromisso.getDataInicio().retornarNumeroMes(compromisso.getDataInicio()) == mes){
				System.out.println(compromisso.getDataInicio().retornarDiaDaSemana(compromisso.getDataInicio()));
				compromisso.mostrar();
				cont1++;
			}
		}
		if (cont1 == 0){
			System.out.println("Não há compromissos esse mês.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (Tarefas tarefa : tarefass) {
			if (tarefa.getDataDeConclusao().retornarNumeroMes(tarefa.getDataDeConclusao()) == mes){
				System.out.println(tarefa.getDataDeConclusao().retornarDiaDaSemana(tarefa.getDataDeConclusao()));
				tarefa.mostrar();
				cont2++;
			}
		}
		if (cont2 == 0){
			System.out.println("Não há tarefas esse mês.");
		}
		System.out.println("========FERIADOS========");
		int cont3 = 0;
		for (Feriados feriados: feriadoss) {
			if (feriados.getData().retornarNumeroMes(feriados.getData()) == mes){
				System.out.println(feriados.getData().retornarDiaDaSemana(feriados.getData()));
				feriados.mostrar();
				cont3++;
			}
		}
		if (cont3 == 0){
			System.out.println("Não há feriados esse mês.");
		}
		System.out.println("=======ANIVERSÁRIOS=======");
		int cont4 = 0;
		for (Aniversario aniversario:aniversarios) {
			if (aniversario.getData().retornarNumeroMes(aniversario.getData()) == mes){
				System.out.println(aniversario.getData().retornarDiaDaSemana(aniversario.getData()));
				aniversario.mostrar();
				cont4++;
			}
		}
		if (cont4 == 0){
			System.out.println("Não há aniversários nesse mês.");
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
		int cont = 0;
		for (Compromissos compromisso : compromissoss){
			if (compromisso.getDataInicio().retornarNumeroDaSemana(compromisso.getDataInicio()) == numeroSemana){
				System.out.println(compromisso.getDataInicio().retornarDiaDaSemana(compromisso.getDataInicio()));
				compromisso.mostrar();
				cont++;
			}
		}
		if (cont == 0){
			System.out.println("Não há compromissos essa semana.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (Tarefas tarefa : tarefass) {
			if (tarefa.getDataDeConclusao().retornarNumeroDaSemana(tarefa.getDataDeConclusao()) == numeroSemana){
				System.out.println(tarefa.getDataDeConclusao().retornarDiaDaSemana(tarefa.getDataDeConclusao()));
				tarefa.mostrar();
				cont2++;
			}
		}
		if (cont2 == 0){
			System.out.println("Não há tarefas essa semana.");
		}
		System.out.println("========FERIADOS========");
		int cont3 = 0;
		for (Feriados feriado : feriadoss) {
			if (feriado.getData().retornarNumeroDaSemana(feriado.getData()) == numeroSemana){
				System.out.println(feriado.getData().retornarDiaDaSemana(feriado.getData()));
				feriado.mostrar();
				cont3++;
			}
		}
		if (cont3 == 0){
			System.out.println("Não há feriados essa semana.");
		}
		System.out.println("=======ANIVERSÁRIOS=======");
		int cont4 = 0;
		for (Aniversario aniversario : aniversarios) {
			if (aniversario.getData().retornarNumeroDaSemana(aniversario.getData()) == numeroSemana){
				System.out.println(aniversario.getData().retornarDiaDaSemana(aniversario.getData()));
				aniversario.mostrar();
				cont4++;
			}
		}
		if (cont4 == 0){
			System.out.println("Não há aniversários essa semana.");
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
		int cont = 0;
		for (Compromissos compromisso : compromissoss){
			if (compromisso.getDataInicio().retornarNumeroDoDiaDoAno(compromisso.getDataInicio()) == numero){
				System.out.println(compromisso.getDataInicio().retornarDiaDaSemana(compromisso.getDataInicio()));
				compromisso.mostrar();
				cont++;
			}
		}
		if (cont == 0){
			System.out.println("Não há compromissos hoje.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (Tarefas tarefa : tarefass) {
			if (tarefa.getDataDeConclusao().retornarNumeroDoDiaDoAno(tarefa.getDataDeConclusao()) == numero){
				System.out.println(tarefa.getDataDeConclusao().retornarDiaDaSemana(tarefa.getDataDeConclusao()));
				tarefa.mostrar();
				cont2++;
			}
		}
		if (cont2 == 0){
			System.out.println("Não há tarefas hoje.");
		}
		System.out.println("========FERIADO========");
		int cont3 = 0;
		for (Feriados feriados:feriadoss) {
			if (feriados.getData().retornarNumeroDoDiaDoAno(feriados.getData()) == numero){
				System.out.println(feriados.getData().retornarDiaDaSemana(feriados.getData()));
				feriados.mostrar();
				cont3++;
			}
		}
		if (cont3 == 0){
			System.out.println("Não há feriado hoje");
		}
		System.out.println("=======ANIVERSÁRIOS=======");
		int cont4 = 0;
		for (Aniversario aniversario:aniversarios) {
			if (aniversario.getData().retornarNumeroDoDiaDoAno(aniversario.getData()) == numero){
				System.out.println(aniversario.getData().retornarDiaDaSemana(aniversario.getData()));
				aniversario.mostrar();
				cont4++;
			}
		}
		if (cont4 == 0){
			System.out.println("Não há aniversários hoje.");
		}
	}


}
