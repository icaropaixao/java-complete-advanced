package encapsulamento.vetores.atvd_pessoas.Model;

public class Pessoa {

    private String nome;
    private  int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // gets sets
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString(){
        return "Nome: " + nome +
                "Idade: " + idade +
                "Altura: " + altura;
    }
}
