package polimorfismo_heranca.metodos_abstratos.entities;

import polimorfismo_heranca.metodos_abstratos.entities_enums.Color;

public abstract class Shape {

    private Color color;

    // construtores
    public Shape(){

    }
    public Shape(Color color){
        this.color = color;
    }

    // gets e sets
    public Color getColor(){
        return  color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    // METODO ABSTRATO
    // ou seja, ele é modificado de acordo com o problema
    public abstract double area();


}
