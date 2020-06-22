package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipularFuncoes{
    Scanner leitura = new Scanner(System.in);
    ArrayList<Venda> vendas = new ArrayList<>();
    private static ArrayList<Produto> produtos = new ArrayList<>();

    
    public static void cadastrarProduto(Produto prod){
        produtos.add(prod);
        
        System.out.println("Produto cadastrado com sucesso!!" + prod);
    }
    
}
