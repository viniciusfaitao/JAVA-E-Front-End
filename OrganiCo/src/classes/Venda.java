
package classes;

public class Venda{
    public static int venda;
    public String nomeComprador;
    public String dataCompra;
    public String produto;
    public int quantidade;
    public float preco;
    public float precoTotal;

    public Venda(String nomeComprador, String dataCompra, String produto, int quantidade, float preco, float precoTotal) {
        this.venda = ++venda;
        this.nomeComprador = nomeComprador;
        this.dataCompra = dataCompra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoTotal = precoTotal;
    }
    
}
