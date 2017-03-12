package br.com.agenda;

import br.com.controle.ControleAniversario;
import br.com.controle.ControleCompromisso;
import br.com.controle.ControleTarefas;

import java.util.Scanner;

/**
 * Created by mauricio on 08/03/17.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleCompromisso c = new ControleCompromisso();
        ControleAniversario ca = new ControleAniversario();
        ControleTarefas ct = new ControleTarefas();
        int opcao = 0;
        do {
            Menu.menuInicial();
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    Menu.menuCompromissos();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                    break;
                case 2:
                    Menu.menuFeriados();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while (opcao != 2);
                    break;
                case 3:
                    Menu.menuTarefas();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                    break;
                case 4:
                    Menu.menuAniversarios();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
            }

        }while (opcao != 5);

    }
}
