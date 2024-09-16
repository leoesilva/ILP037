
/**
 * Classe que representa um cartão de débito utilizado como estratégia de pagamento.
 */
public class DebitCard implements PaymentStrategy {
    /**
     * Realiza o pagamento utilizando o cartão de débito.
     * @param amount O valor a ser pago.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Pagos R$ " + String.format("%.2f", amount) + " usando cartão de débito.");
    }
}