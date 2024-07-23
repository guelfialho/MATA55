import java.util.Date;

public class Aluno {
  private String nome_civil, nome, mae, pai, naturalidade, cpf, rua, complemento, bairro, telefone, serie;
  private Date data_nascimento;
  private int numero, matricula;
  private Escola escola;
  private Rota rota;

  public Aluno(String nome_civil, String nome, String mae, String pai, String naturalidade, String cpf, String rua, String complemento, String bairro, String telefone, String serie, Date data_nascimento, int numero, int matricula){
    this.nome_civil = nome_civil;
    this.nome = nome;
    this.mae = mae;
    this.pai = pai;
    this.naturalidade = naturalidade;
    this.cpf = cpf;
    this.rua = rua;
    this.complemento = complemento;
    this.bairro = bairro;
    this.telefone = telefone;
    this.serie = serie;
    this.data_nascimento = data_nascimento;
    this.numero = numero;
    this.matricula = matricula;
  }

  public String getNome_civil() {
    return nome_civil;
  }

  public void setNome_civil(String nome_civil) {
    this.nome_civil = nome_civil;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMae() {
    return mae;
  }

  public void setMae(String mae) {
    this.mae = mae;
  }

  public String getPai() {
    return pai;
  }

  public void setPai(String pai) {
    this.pai = pai;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public Date getData_nascimento() {
    return data_nascimento;
  }

  public void setData_nascimento(Date data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public Escola getEscola() {
    return escola;
  }

  public void setEscola(Escola escola) {
    this.escola = escola;
  }

  public Rota getRota() {
    return rota;
  }

  public void setRota(Rota rota) {
    this.rota = rota;
  }



}
