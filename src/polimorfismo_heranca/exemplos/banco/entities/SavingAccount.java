package polimorfismo_heranca.exemplos.banco.entities;

// conta poupança
public class SavingAccount extends Account {

    private double interestRate; // juros

    // construtor
    public SavingAccount(){
        super();
    }

    public SavingAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    // gets sets
    public  double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }


    // method juros
    public void updateBalance() {
        balance += balance  * interestRate;

    }

    // method de saque subscrevido
    @Override
    public  void withDraw(double amount){
        balance -= amount;
    }
}
