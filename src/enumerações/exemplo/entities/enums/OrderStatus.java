package enumerações.exemplo.entities.enums;

// Declaração de uma enumeração chamada 'OrderStatus', que contém os diferentes estados possíveis de um pedido.
public enum OrderStatus {

    // Definição dos valores da enumeração. Cada um desses valores representa um estado possível de um pedido.
    PAGAMENTO_PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE,

    ; // O ponto e vírgula aqui é opcional neste caso, mas pode ser necessário se houver métodos ou outros membros na enum.
}
