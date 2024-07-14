import java.util.Date;

public class Motorista {
    String nome_civil, nome, mae, pai, naturalidade, cpf_cnpj, rua, complemento, bairro, telefone, num_habilitacao, cat_habilitacao, num_contrato;
    Date data_nascimento;
    int numero, tipo;

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

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
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

    public String getNum_habilitacao() {
        return num_habilitacao;
    }

    public void setNum_habilitacao(String num_habilitacao) {
        this.num_habilitacao = num_habilitacao;
    }

    public String getCat_habilitacao() {
        return cat_habilitacao;
    }

    public void setCat_habilitacao(String cat_habilitacao) {
        this.cat_habilitacao = cat_habilitacao;
    }

    public String getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(String num_contrato) {
        this.num_contrato = num_contrato;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNumContrato(String numContrato) {
        if (tipo == 1) {
            this.num_contrato = numContrato;
        } else {
            System.out.println("Método inválido.");
        }
    }

    public void verificarTipo() {
        if (tipo == 0) {
            System.out.println("Motorista é servidor.");
        } else if (tipo == 1) {
            System.out.println("Motorista é terceirizado.");
        }
    }

    public Motorista(String nome_civil, String nome, String mae, String pai, String naturalidade, String cpf_cnpj, String rua, String complemento, String bairro, String telefone, String num_habilitacao, String cat_habilitacao, int numero, int tipo , String num_contrato, Date data_nascimento ) {
        this.nome_civil = nome_civil;
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
        this. naturalidade = naturalidade;
        this.cpf_cnpj = cpf_cnpj;
        this.rua = rua;
        this.complemento =complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.num_habilitacao = num_habilitacao;
        this.cat_habilitacao = cat_habilitacao;
        this.numero = numero;
        this.tipo = tipo;
        this.num_contrato = (tipo == 1) ? num_contrato : null;
        this.data_nascimento = data_nascimento;
    }




    public static void main(String[] args) {}
}