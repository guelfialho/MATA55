public class Veiculo {
    String placa, modelo, numContrato;
    int ano, capacidade, tipo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        if (tipo == 1) {
            this.numContrato = numContrato;
        } else {
            System.out.println("Método inválido.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Veiculo(String placa, int ano, String modelo, int capacidade, int tipo, String numContrato ) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.numContrato = (tipo == 1) ? numContrato : null;
    }

    public void verificarTipo() {
        if (tipo == 0) {
            System.out.println("Veículo é próprio.");
        } else if (tipo == 1) {
            System.out.println("Veículo é alugado.");
        }
    }

    public static void main(String[] args) {}
}
