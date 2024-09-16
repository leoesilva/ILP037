
/**
 * Classe que representa um pedido.
 */
public class Order {
    
    /**
     * Item do pedido.
     */
    private Item item;
    
    /**
     * Estratégia de pagamento do pedido.
     */
    private PaymentStrategy paymentStrategy;

    /**
     * Construtor da classe Order.
     * @param item O item do pedido.
     */
    public Order(Item item) {
        this.item = item;
    }

    /**
     * Define a estratégia de pagamento do pedido.
     * @param paymentStrategy A estratégia de pagamento.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Processa o pedido.
     */
    public void processOrder() {
        System.out.println("Pedido: " + item.getDescription());
        System.out.println("Total: R$" + String.format(".2f",item.getPrice()));
        paymentStrategy.pay(item.getPrice());
    }
}
