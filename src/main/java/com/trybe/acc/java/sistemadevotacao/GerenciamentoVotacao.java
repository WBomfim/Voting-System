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
        break;
      }
    }
    PessoaCandidata novaPessoa = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(novaPessoa);
  }
  
  /**
   * Método PessoaEleitora.
   * 
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoa : this.pessoasEleitoras) {
      if (pessoa.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já utilizado!");
        break;
      }
    }
    PessoaEleitora novaPessoa = new PessoaEleitora(nome, cpf);
    this.pessoasEleitoras.add(novaPessoa);
  }
  
}


