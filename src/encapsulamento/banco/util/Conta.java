package encapsulamento.banco.util;

public class Conta {

    private String titular;
    private int numero;
    private double saldo;

    // Construtor sem depósito inicial
    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    // Construtor com depósito inicial
    public Conta(String titular, double valorInicial, int numero) {
        this.numero = numero;
        this.titular = titular;
        deposito(valorInicial); // Usando o método de depósito para inicializar o saldo
    }

    // Getters e setters
    public String getTitular() {
        return titular;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Funcionalidades
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= (valor + 5.0)) { // Validação para impedir saldo negativo
            saldo -= valor + 5.0; // Desconto de taxa de saque
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + getNumero()
                + "\nTitular: " + titular
                + "\nSaldo da conta: " + String.format("%.2f", saldo);
    }
}
