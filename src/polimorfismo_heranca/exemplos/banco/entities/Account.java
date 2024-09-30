package polimorfismo_heranca.exemplos.banco.entities;

public class Account {

    private int number;
    private String holder;
    protected double balance; // para ser posivel utilizar no metodo de emprestimo

    public Account() {
    }
    public Account(int number, String holder, double balance) {
      this.number = number;
      this.holder = holder;
      this.balance = balance;


    }

    // gets sets
    public int getNumber(){
        return number;
    }
    public String getHolder(){
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }
    public double getBalance(){
        return balance;
    }

    // methods
    public void withDraw (double amount){
        balance -= amount;
    }
    public void deposit (double amount) {
        balance += amount;
    }

}
