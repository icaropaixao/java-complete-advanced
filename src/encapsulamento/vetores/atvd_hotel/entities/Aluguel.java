package encapsulamento.vetores.atvd_hotel.entities;

public class Aluguel {
    private String name;
    private String email;

    // construtores
    public  Aluguel(){

    }
    public Aluguel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getters e setters
    public String getName(){
        return name;

    }
    public String getEmail(){
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail (String email){
        this.email = email;

    }

    @Override
    public String toString(){
        return "Nome: " + name + ", Email: " + email;
    }

}
