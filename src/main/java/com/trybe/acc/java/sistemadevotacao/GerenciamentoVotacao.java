package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;


/**
 * Class GerenciamentoVotacao.
 *
 */
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfComputado;
  private Integer totalVotos;
  
  /**
   * Contrutor.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
    this.cpfComputado = new ArrayList<String>();
    this.totalVotos = 0;
  }
  
  /**
   * Método cadastrarPessoaCandidata.
   *
   */
  public void cadastrarPessoaCandidata(String nome, Integer numero) {
    for (PessoaCandidata pessoa : this.pessoasCandidatas) {
      if (pessoa.getNumero().equals(numero)) {
        System.out.println("Número pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata novaPessoa = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(novaPessoa);
  }
  
  /**
   * Método cadastrarPessoaEleitora.
   * 
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoa : this.pessoasEleitoras) {
      if (pessoa.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já utilizado!");
        return;
      }
    }
    PessoaEleitora novaPessoa = new PessoaEleitora(nome, cpf);
    this.pessoasEleitoras.add(novaPessoa);
  }
  
  /**
   * Método votar.
   * 
   */
  public void votar(String cpfPessoaEleitora, Integer numeroPessoaCandidata) {
    if (this.cpfComputado.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }
    
    for (PessoaCandidata pessoa : this.pessoasCandidatas) {
      if (pessoa.getNumero().equals(numeroPessoaCandidata)) {
        pessoa.receberVoto();
        this.cpfComputado.add(cpfPessoaEleitora);
        this.totalVotos += 1;
        return;
      }
    }
  }
  
  private double calcularPorcentagemVotos(Integer index) {
    double votosCandidato = (double) this.pessoasCandidatas.get(index).getVotos();
    return Math.round((votosCandidato / this.totalVotos) * 100);
  }
  
  /**
   * Método mostrarResultado.
   */
  public void mostrarResultado() {
    if (this.cpfComputado.size() == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    
    for (int index = 0; index < this.pessoasCandidatas.size(); index += 1) {
      PessoaCandidata candidato = this.pessoasCandidatas.get(index);
      double porcentagem = this.calcularPorcentagemVotos(index);
      System.out.println(
          String.format(
              "Nome: %s - %d votos ( %.1f%% )",
              candidato.getNome(),
              candidato.getVotos(),
              porcentagem
          )
      );
    }
    System.out.println(String.format("Total de votos: %d", this.totalVotos));
  }
  
}
