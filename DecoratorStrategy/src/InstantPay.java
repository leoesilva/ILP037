
/**
 * Classe que representa um método de pagamento instantâneo.
 * Implementa a interface PaymentStrategy.
 */
public class InstantPay implements PaymentStrategy {
    /**
     * Realiza o pagamento utilizando o pagamento instantâneo (PIX)
     * @param amount O valor a ser pago.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Pagos R$ " + String.format("%.2f", amount) + " usando PIX.");
    }

}
