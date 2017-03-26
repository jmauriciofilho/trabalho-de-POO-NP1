package br.com.agenda;

import br.com.controle.ControleCompromisso;
import br.com.models.Compromissos;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mauricio on 24/03/17.
 */
public class FormularioAgenda {

	public static void compromissosDoMes(Scanner scanner, ControleCompromisso c){
		List<Compromissos> compromissos = c.buscarTodos();
		System.out.println("Qual mês deseja vizualizar seus compromissos:");
		System.out.println("Por favor digite o numero do mes.");
		scanner.nextLine();
		String mes = scanner.nextLine().toUpperCase();
		String nomeMes = null;
		if (mes.equals("01")){
			nomeMes = "Janeiro";
		}else if (mes.equals("02")){
			nomeMes = "Fevereiro";
		}else if (mes.equals("03")){
			nomeMes = "Março";
		}else if (mes.equals("04")){
			nomeMes = "Abril";
		}else if (mes.equals("05")){
			nomeMes = "Maio";
		}else if (mes.equals("06")){
			nomeMes = "Junho";
		}else if (mes.equals("07")){
			nomeMes = "Julho";
		}else if (mes.equals("08")){
			nomeMes = "Agosto";
		}else if (mes.equals("09")){
			nomeMes = "Setembro";
		}else if (mes.equals("10")){
			nomeMes = "Outubro";
		}else if (mes.equals("11")){
			nomeMes = "Novembro";
		}else if (mes.equals("12")){
			nomeMes = "Dezembro";
		}
		System.out.println("==========" + nomeMes + "==========");
		for (int i = 0; i < compromissos.size(); i++){
			if (compromissos.get(i).getDataInicio().getMes().equals(mes)){
				compromissos.get(i).mostrar();
			}
			System.out.println("=======================================");
		}

	}

	public static void compromissosDaSemana(ControleCompromisso c){
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

	public static void compromissosDoDia(Scanner scanner, ControleCompromisso c){
		List<Compromissos> compromissos = c.buscarTodos();
		System.out.println("Informe o dia, mes e ano que deseja saber seus compromissos:");
		System.out.println("Dia:");
		scanner.nextLine();
		String dia = scanner.nextLine();
		System.out.println("Mês:");
		String mes = scanner.nextLine();
		System.out.println("Ano:");
		int ano = scanner.nextInt();
		System.out.println("=========" + dia + "/" + mes + "/" + ano + "=========");
		for (int i = 0; i < compromissos.size(); i++){
			if (compromissos.get(i).getDataInicio().getDia().equals(dia) &&
					compromissos.get(i).getDataInicio().getMes().equals(mes) &&
					compromissos.get(i).getDataInicio().getAno() == ano){
				compromissos.get(i).mostrar();
			}
			System.out.println("=======================================");
		}
	}


}
