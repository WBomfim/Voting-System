package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**
 * Class Principal.
 *
 */
public class Principal {
  private static GerenciamentoVotacao gerenciamentoVotacao;
  private static Scanner scan;
  private static short opcao;

  /**
   * Método Principal.
   * 
   */
  public static void main(String[] args) {
    gerenciamentoVotacao = new GerenciamentoVotacao();
    scan = new Scanner(System.in);
    
    do {

    } while (opcao != 2);

    do {

    } while (opcao != 2);

    do {

    } while (opcao != 3);
  
  }
  
  private static void menuCadastroCandidato() {
    System.out.println("Cadastrar pessoa candidata?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
    opcao = scan.nextShort();
  }
  
  private static void menuCadastroEleitor() {
    System.out.println("Cadastrar pessoa eleitora?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
    opcao = scan.nextShort();
  }

  private static void menuVotacao() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Votar");
    System.out.println("2 - Resultado Parcial");
    System.out.println("3 - Finalizar Votação");
    opcao = scan.nextShort();
  }
  
  private static void cadastrarEleitor() {
    System.out.println("Entre com o nome da pessoa eleitora:");
    String nomeEleitor = scan.next();
    System.out.println("Entre com o cpf da pessoa eleitora:");
    String cpfEleitor = scan.next();
    gerenciamentoVotacao.cadastrarPessoaEleitora(nomeEleitor, cpfEleitor);
  }
  
  private static void cadastrarCandidato() {
    System.out.println("Entre com o nome da pessoa candidata:");
    String nomeCandidato = scan.next();
    System.out.println("Entre com o número da pessoa candidata:");
    int numeroCandidato = scan.nextInt();
    gerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidato, numeroCandidato);
  }
  
  private static void votar() {
    System.out.println("Entre com o cpf da pessoa eleitora:");
    String cpfEleitor = scan.next();
    System.out.println("Entre com o número da pessoa candidata:");
    int numeroCandidato = scan.nextInt();
    gerenciamentoVotacao.votar(cpfEleitor, numeroCandidato);
  }
}
