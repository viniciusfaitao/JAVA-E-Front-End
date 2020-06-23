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
