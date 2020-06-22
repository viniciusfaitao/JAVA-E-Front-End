package classes;

public class Venda extends Produto{
    private int quantidade;

    public Venda(int quantidade, String tipo, String nome, String dataColheita, String nomeAgricultor, float valor, int qEstoque) {
        super(tipo, nome, dataColheita, nomeAgricultor, valor, qEstoque);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
