package entities;

public class Produto {
    public String name;
    public double price;
    public int quantity;

    public Produto(){}

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totaValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        System.out.println("!!Produto adicionado!!");
        return "Nome: " + name + ", " + " Preço:R$" + String.format("%.2f", price) + ", " +
                " Quantidade no estoque: " + quantity + ", " +
                "Valor total do de Produtos " + String.format("%.2f%n", totaValueInStock());
    }
}
