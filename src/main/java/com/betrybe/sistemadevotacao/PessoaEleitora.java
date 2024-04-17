package com.betrybe.sistemadevotacao;

/**
 * The type Pessoa eleitora.
 */
public class PessoaEleitora extends Pessoa{
  private String cpf;

  /**
   * Gets cpf.
   *
   * @return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Sets cpf.
   *
   * @param cpf the cpf
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
