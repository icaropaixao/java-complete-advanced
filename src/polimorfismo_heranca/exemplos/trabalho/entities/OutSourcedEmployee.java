package polimorfismo_heranca.exemplos.trabalho.entities;

public class OutSourcedEmployee extends Employee{

    private double additionalCharge;

    // construtor
    public OutSourcedEmployee(){
        super();
    }

    public OutSourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge(){
        return additionalCharge;
    }
    public void setAdditionalCharge(){
        this.additionalCharge = additionalCharge;
    }

    // metodo de pagamento alterado para funcionarios terceirizados usando polimorfismo com a logica já criada no metodo payment na classe Employee
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }


}
