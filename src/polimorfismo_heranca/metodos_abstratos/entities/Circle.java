package polimorfismo_heranca.metodos_abstratos.entities;

import polimorfismo_heranca.metodos_abstratos.entities_enums.Color;

public class Circle extends Shape {

    private double radius;

    //constructors
    public Circle(){
        super();
    }
    public Circle(Color color,double radius){
        super(color);
        this.radius = radius;
    }

    // gets sets
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // metodo modificado de acordo com a classes
    @Override
    public double area(){
        return Math.PI * radius * radius; // calcular raip de circulo
    }
}
