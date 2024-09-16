
/**
 * Classe que representa o pagamento em dinheiro.
 * Implementa a interface PaymentStrategy.
 */

public class Cash implements PaymentStrategy {
    /**
     * Realiza o pagamento em dinheiro.
     * @param amount o valor a ser pago
     */
    @Override
    public void pay(double amount) {
        System.out.println("Pagos R$ " + String.format("%.2f", amount) + " usando dinheiro.");
    }

}
