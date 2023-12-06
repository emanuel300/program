import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Produto produtos1 = new Produto();


        System.out.print("Nome do produto: ");
        String name = ler.nextLine();

        System.out.print("Preço do produto: ");
        double price = ler.nextDouble();

        System.out.print("Quantidade no estoque: ");
        int quantity = ler.nextInt();

        Produto produto = new Produto(name, price, quantity);

        System.out.println(produto);
        System.out.println();

        System.out.print("Digite o número de Produtos a ser ADICIONADO ao Stock: ");
        int qtd = ler.nextInt();
        produto.addProducts(qtd);
        System.out.println("Update de produtos realizados!!!");
        System.out.println(produto);

        System.out.print("Digite o número de Produtos a ser EXCLUIDO do Stock: ");
        int dell = ler.nextInt();
        produto.removeProducts(dell);
        System.out.println("Exclusão realixada com sucesso!!!");
        System.out.println(produto);






        ler.close();
    }
}