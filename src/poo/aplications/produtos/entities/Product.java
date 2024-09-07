package poo.aplications.produtos.entities;

public class Product {

    public String name;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque(){
        return preco *quantidade;
    }

    public  void addProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProducts(int quantidade){
        this.quantidade -= quantidade;
    }



}
