package br.com.agenda;

import br.com.controle.ControleCompromisso;
import br.com.models.Compromissos;

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
		System.out.println("==========" + mes + "==========");
		for (int i = 0; i < compromissos.size(); i++){
			if (compromissos.get(i).getDataInicio().getMes().equals(mes)){
				compromissos.get(i).mostrar();
			}
			System.out.println("=======================================");
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
