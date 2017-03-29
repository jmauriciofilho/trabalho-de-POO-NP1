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
		PadraoData dtAtual = new PadraoData();


		System.out.println("==========" + dtAtual.getMes() + "==========");
		System.out.println("==========COMPROMISSOS=========");
		int cont1 = 0;
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).getDataCompleta().getMes().toUpperCase() == dtAtual.getMes().toUpperCase()){
				System.out.println(compromissoss.get(i).getDataCompleta().getDiaSemana());
				compromissoss.get(i).mostrar();
				cont1++;
			}
		}
		if (cont1 == 0){
			System.out.println("Não há compromissos esse mês.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).getDataDeConclusao().getMes().toUpperCase() == dtAtual.getMes().toUpperCase()){
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
			if (feriados.getData().getMes().toUpperCase() == dtAtual.getMes().toUpperCase()){
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
			if (aniversario.getDataNiver().getMes().toUpperCase() == dtAtual.getMes().toUpperCase()){
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
		PadraoData dtAtual = new PadraoData();

		System.out.println("==========COMPROMISSOS=========");
		int cont = 0;
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).getDataCompleta().getSemanaDoMes() == dtAtual.getSemanaDoMes()){
				System.out.println(compromissoss.get(i).getDataCompleta().getDiaSemana());
				compromissoss.get(i).mostrar();
				cont++;
			}
		}
		if (cont == 0){
			System.out.println("Não há compromissos essa semana.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).getDataDeConclusao().getSemanaDoMes() == dtAtual.getSemanaDoMes()){
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
			if (feriado.getData().getSemanaDoMes() == dtAtual.getSemanaDoMes()){
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
			if (aniversario.getDataNiver().getSemanaDoMes() == dtAtual.getSemanaDoMes()){
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
		PadraoData dtAtual = new PadraoData();

		System.out.println("==========COMPROMISSOS=========");
		int cont = 0;
		for (int i = 0; i < compromissoss.size(); i++){
			if (compromissoss.get(i).getDataCompleta().getApenasData()  == dtAtual.getApenasData()){
				System.out.println(compromissoss.get(i).getDataCompleta().getDiaSemana());
				compromissoss.get(i).mostrar();
				cont++;
			}
		}
		if (cont == 0){
			System.out.println("Não há compromissos hoje.");
		}
		System.out.println("=======TAREFAS========");
		int cont2 = 0;
		for (int i = 0; i < tarefass.size(); i++) {
			if (tarefass.get(i).getDataDeConclusao().getApenasData() == dtAtual.getApenasData()){
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
			if (feriados.getData().getApenasData() == dtAtual.getApenasData()){
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
			if (aniversario.getDataNiver().getApenasData() == dtAtual.getApenasData()){
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
