package enumerações.exemplo.model;

import java.util.Date;
import enumerações.exemplo.entities.enums.OrderStatus;

public class Pedido {

    private Integer id;
    private Date moment;
    private OrderStatus status;

    // construtores
    public Pedido() {

    }
    public Pedido(Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }


    // gets sets
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", moment=" + moment +
                ", status = " + status +
                '}';
    }
}
