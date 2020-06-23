package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipularFuncoes{
    Scanner leitura = new Scanner(System.in);
    public static ArrayList<Produto> produtos = new ArrayList<>();
    public static ArrayList<Venda> vendas = new ArrayList<>();
    
    public static void cadastrarProduto(Produto prod){
        produtos.add(prod);
    }
    
    public static void cadastrarVenda(Venda ven){
        vendas.add(ven);
    }
    
}
