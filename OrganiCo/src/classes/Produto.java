package classes;

public class Produto {
    public String tipo;
    public String nome;
    public String dataColheita;
    public String nomeAgricultor;
    public int qEstoque;
    public float valor;


    public Produto(String tipo, String nome, String dataColheita, String nomeAgricultor, int qEstoque, float valor) {
        this.tipo = tipo;
        this.nome = nome;
        this.dataColheita = dataColheita;
        this.nomeAgricultor = nomeAgricultor;
        this.qEstoque = qEstoque;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataColheita() {
        return dataColheita;
    }

    public void setDataColheita(String dataColheita) {
        this.dataColheita = dataColheita;
    }

    public String getNomeAgricultor() {
        return nomeAgricultor;
    }

    public void setNomeAgricultor(String nomeAgricultor) {
        this.nomeAgricultor = nomeAgricultor;
    }

    public int getqEstoque() {
        return qEstoque;
    }

    public void setqEstoque(int qEstoque) {
        this.qEstoque = qEstoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    @Override
    public String toString(){
        String relatorio = "";
        relatorio += "Agricultor: " + nomeAgricultor;
        relatorio += "\nTipo: " + tipo;
        relatorio += "\nNome: " + nome;
        relatorio += "\nData da colheita: " + dataColheita;
        relatorio += "\nQuantidade: " + qEstoque;
        relatorio += "\nValor: R$ " + valor;
        
        return relatorio;
    }

}
