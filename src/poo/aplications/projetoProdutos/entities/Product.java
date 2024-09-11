package poo.aplications.projetoProdutos.entities;

public class Product {

    public String name;
    public double preco;
    public int quantidade;

    public Product(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public double valorTotal(){
        return preco * quantidade;
    }

    public  void addProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProducts(int quantidade){
        this.quantidade -= quantidade;
    }

    // subscrevendo o toString
    public String toString () {
        return "Produto: " + name
                + ", Preço: " + String.format("%.2f", preco) + "R$ " // formatando para duas casas decimais
                + ", "
                + quantidade
                + " unidades , Total: R$ "
                + String.format ("%.2f", valorTotal());
    }


}
