package br.com.agenda;

import br.com.controle.ControleAniversario;
import br.com.controle.ControleCompromisso;
import br.com.controle.ControleFeriados;
import br.com.controle.ControleTarefas;
import br.com.models.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by mauricio and zeky on 24/03/17.
 */
public class ModoAgenda {

	public static void mostrarCompromissosDoMes(ControleCompromisso c, ControleTarefas ct, ControleFeriados cf, ControleAniversario ca){
		List<Compromissos> compromissoss = c.buscarTodos();
		List<Tarefas> tarefass = ct.buscarTodos();
		Feriados[] feriadoss = cf.buscarTodos();
		List<Aniversario> aniversarios = ca.buscarTodos();
		PadraoData hoje = new PadraoData();

		Calendar calendar = Calendar.getInstance();
		int mes = calendar.get(Calendar.MONTH);


		System.out.println("==========" + hoje.getMes() + "==========");
		System.out.println("==========COMPROMISSOS=========");
		int cont1 = 0;
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).getDataCompleta().getNumeroMes() == mes){
				System.out.println(compromissoss.get(i).getDataCompleta().getDiaSemana());
				compromissoss.get(i).mostrar();

				if(compromissoss.get(i).getRepeticoes()!= null){
					for (int j = 0; j < compromissoss.get(i).getRepeticoes().size(); j++) {
						if (compromissoss.get(i).getRepeticoes().get(j).getDataCompleta().getNumeroMes() == mes){
							System.out.println(compromissoss.get(i).getRepeticoes().get(j).getDataCompleta().getDiaSemana());
							compromissoss.get(i).getRepeticoes().get(j).mostrar();
						}
					}
				}

				cont1++;
			}
		}
		if (cont1 == 0){
			System.out.println("Não há compromissos esse mês.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).getDataDeConclusao().getNumeroMes() == mes){
				System.out.println(tarefass.get(i).getDataDeConclusao().getDiaSemana());
				tarefass.get(i).mostrar();
				cont2++;
			}
		}
		if (cont2 == 0){
			System.out.println("Não há tarefas esse mês.");
		}
		System.out.println("========FERIADOS========");
		int cont3 = 0;
		for (Feriados feriados: feriadoss) {
			if (feriados.getData().getNumeroMes() == mes){
				System.out.println(feriados.getData().getDiaSemana());
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
			if (aniversario.getDataNiver().getNumeroMes() == mes){
				System.out.println(aniversario.getDataNiver().getDiaSemana());
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
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).getDataCompleta().getNumeroSemana() == numeroSemana){
				System.out.println(compromissoss.get(i).getDataCompleta().getDiaSemana());
				compromissoss.get(i).mostrar();
				if(compromissoss.get(i).getRepeticoes()!= null){
					for (int j = 0; j < compromissoss.get(i).getRepeticoes().size(); j++) {
						if (compromissoss.get(i).getRepeticoes().get(j).getDataCompleta().getNumeroSemana() == numeroSemana){
							System.out.println(compromissoss.get(i).getRepeticoes().get(j).getDataCompleta().getDiaSemana());
							compromissoss.get(i).getRepeticoes().get(j).mostrar();
						}
					}
				}
				cont++;
			}
		}
		if (cont == 0){
			System.out.println("Não há compromissos essa semana.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).getDataDeConclusao().getNumeroSemana() == numeroSemana){
				System.out.println(tarefass.get(i).getDataDeConclusao().getDiaSemana());
				tarefass.get(i).mostrar();
				cont2++;
			}
		}
		if (cont2 == 0){
			System.out.println("Não há tarefas essa semana.");
		}
		System.out.println("========FERIADOS========");
		int cont3 = 0;
		for (Feriados feriado : feriadoss) {
			if (feriado.getData().getNumeroSemana() == numeroSemana){
				System.out.println(feriado.getData().getDiaSemana());
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
			if (aniversario.getDataNiver().getNumeroSemana() == numeroSemana){
				System.out.println(aniversario.getDataNiver().getDiaSemana());
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
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).getDataCompleta().getNumeroDiadoAno() == numero){
				System.out.println(compromissoss.get(i).getDataCompleta().getDiaSemana());
				compromissoss.get(i).mostrar();
				if(compromissoss.get(i).getRepeticoes()!= null){
					for (int j = 0; j < compromissoss.get(i).getRepeticoes().size(); j++) {
						if (compromissoss.get(i).getRepeticoes().get(j).getDataCompleta().getNumeroDiadoAno() == numero){
							System.out.println(compromissoss.get(i).getRepeticoes().get(j).getDataCompleta().getDiaSemana());
							compromissoss.get(i).getRepeticoes().get(j).mostrar();
						}
					}
				}
				cont++;
			}
		}
		if (cont == 0){
			System.out.println("Não há compromissos hoje.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).getDataDeConclusao().getNumeroDiadoAno() == numero){
				System.out.println(tarefass.get(i).getDataDeConclusao().getDiaSemana());
				tarefass.get(i).mostrar();
				cont2++;
			}
		}
		if (cont2 == 0){
			System.out.println("Não há tarefas hoje.");
		}
		System.out.println("========FERIADO========");
		int cont3 = 0;
		for (Feriados feriados:feriadoss) {
			if (feriados.getData().getNumeroDiadoAno() == numero){
				System.out.println(feriados.getData().getDiaSemana());
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
			if (aniversario.getDataNiver().getNumeroDiadoAno() == numero){
				System.out.println(aniversario.getDataNiver().getDiaSemana());
				aniversario.mostrar();
				cont4++;
			}
		}
		if (cont4 == 0){
			System.out.println("Não há aniversários hoje.");
		}
	}


}
