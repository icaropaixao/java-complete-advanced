package polimorfismo_heranca.exemplos.banco.entities;

public class BusinessAccount extends Account{

    private  double loanLimit;

    // construtor
    public BusinessAccount() {
        super();
    }
    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    // get set
    public double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // metodo de emprestimo
    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }

    }

    @Override
    public void withDraw(double amount){
        super.withDraw(amount);
        balance -= 2;
    }

}
