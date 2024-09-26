package enumerações.exemplo.app;

import enumerações.exemplo.entities.enums.OrderStatus;
import enumerações.exemplo.model.Pedido;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        // Cria um novo objeto 'Pedido'
        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
        System.out.println(pedido);

        // Atribui à variável 'os1' o valor 'ENTREGUE' da enumeração 'OrderStatus'.
        OrderStatus os1 = OrderStatus.ENTREGUE;

        // Usa o método 'valueOf' da classe 'Enum' para converter a string "ENTREGUE" em um valor da enumeração 'OrderStatus'.
        // O valor retornado é equivalente a 'OrderStatus.ENTREGUE'.
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}
