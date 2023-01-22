package com.trybe.acc.java.sistemadevotacao;

/**
 * Class PessoaCandidata.
 *
 */
public class PessoaCandidata extends Pessoa {
  private Integer numero;
  private Integer votos;
  
  /**
   * Construtor.
   *
   */
  public PessoaCandidata(String nome, Integer numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Integer getVotos() {
    return votos;
  }

  public void setVotos(Integer votos) {
    this.votos = votos;
  }
  
  public void receberVoto() {
    this.votos += 1;
  }
}
