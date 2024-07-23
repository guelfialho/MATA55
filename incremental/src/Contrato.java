import java.util.Date;

public class Contrato {
  private int num_contrato;
  private Date data_inicio, data_fim;
  private double valor;

  public Contrato(int num_contrato, Date data_inicio, Date data_fim, double valor){
    this.num_contrato = num_contrato;
    this.data_fim = data_fim;
    this.data_inicio = data_inicio;
    this.valor = valor;
  }

  public int getNum_contrato() {
    return num_contrato;
  }

  public void setNum_contrato(int num_contrato) {
    this.num_contrato = num_contrato;
  }

  public Date getData_inicio() {
    return data_inicio;
  }

  public void setData_inicio(Date data_inicio) {
    this.data_inicio = data_inicio;
  }

  public Date getData_fim() {
    return data_fim;
  }

  public void setData_fim(Date data_fim) {
    this.data_fim = data_fim;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }



}
