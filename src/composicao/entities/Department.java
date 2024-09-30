package composicao.entities;

public class Department {

    private String name;

    // construtor
    public Department(){

    }
    public Department(String name) {
        this.name = name;
    }

    // get e sets
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
