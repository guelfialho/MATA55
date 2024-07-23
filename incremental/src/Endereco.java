public class Endereco {
private String rua, complemento, bairro;
private int numero;

public Endereco(String rua, String complemento, String bairro, int numero){
  this.rua = rua;
  this.complemento = complemento;
  this.bairro = bairro;
  this.numero = numero;
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

public int getNumero() {
  return numero;
}

public void setNumero(int numero) {
  this.numero = numero;
}
}
