package classes;

public class Produto {
    private String tipo;
    private String nome;
    private String dataColheita;
    private String nomeAgricultor;
    private float valor;
    private int qEstoque;

    public Produto(String tipo, String nome, String dataColheita, String nomeAgricultor, float valor, int qEstoque) {
        this.tipo = tipo;
        this.nome = nome;
        this.dataColheita = dataColheita;
        this.nomeAgricultor = nomeAgricultor;
        this.valor = valor;
        this.qEstoque = qEstoque;
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
