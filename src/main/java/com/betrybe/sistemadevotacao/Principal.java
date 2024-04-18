package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * The type Principal.
 */
public class Principal {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    char optionCadastrarCandidatoMenu;
    cadastrarCandidatoMenu();
    optionCadastrarCandidatoMenu = scanner.nextLine().charAt(0);

    do {
      System.out.println("Entre com o nome da pessoa candidata:");
      String nome = scanner.nextLine();
      System.out.println("Entre com o número da pessoa candidata:");
      int numero = Integer.parseInt(scanner.nextLine());
      gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      cadastrarCandidatoMenu();
      optionCadastrarCandidatoMenu = scanner.nextLine().charAt(0);
    } while (optionCadastrarCandidatoMenu != '2');

    cadastrarEleitorMenu();
    char optionCadastrarEleitorMenu;
    optionCadastrarEleitorMenu = scanner.nextLine().charAt(0);

    do {
      System.out.println("Entre com o nome da pessoa eleitora:");
      String nome = scanner.nextLine();
      System.out.println("Entre com o CPF da pessoa eleitora:");
      String cpf = scanner.nextLine();
      gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      cadastrarEleitorMenu();
      optionCadastrarEleitorMenu = scanner.nextLine().charAt(0);
    } while (optionCadastrarEleitorMenu != '2');

    votacaoMenu();
    char optionVotacaoMenu;
    optionVotacaoMenu = scanner.nextLine().charAt(0);

    while (optionVotacaoMenu != '3') {
      if (optionVotacaoMenu == '1') {
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.votar(cpf, numero);
      } else if (optionVotacaoMenu == '2') {
        gerenciamentoVotacao.mostrarResultado();
      }
      votacaoMenu();
      optionVotacaoMenu = scanner.nextLine().charAt(0);
    }

    gerenciamentoVotacao.mostrarResultado();
  }


  /**
   * Cadastrar candidato menu.
   */
  public static void cadastrarCandidatoMenu() {
    System.out.println("Cadastrar pessoa candidata?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
  }

  /**
   * Cadastrar eleitor menu.
   */
  public static void cadastrarEleitorMenu() {
    System.out.println("Cadastrar pessoa eleitora?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
  }

  /**
   * Votacao menu.
   */
  public static void votacaoMenu() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Votar");
    System.out.println("2 - Resultado Parcial");
    System.out.println("3 - Finalizar Votação");
  }
}


