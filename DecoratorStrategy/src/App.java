/**
 * A classe App representa o ponto de entrada principal da aplicação.
 * Ela demonstra o uso dos padrões de projeto Decorator e Strategy.
 */

public class App {
    /**
     * Método principal que inicia a execução do programa.
     * Cria um objeto de sorvete de baunilha e adiciona cobertura de morango e granulado de chocolate.
     * Em seguida, cria um objeto de pedido com o sorvete e define a estratégia de pagamento como cartão de débito.
     * Por fim, processa o pedido.
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        Item iceCream = new VanillaIceCream();
        iceCream = new StrawberryTopping(iceCream);
        iceCream = new ChocolateSprinkles(iceCream);

        Order order = new Order(iceCream);

        order.setPaymentStrategy(new DebitCard());

        order.processOrder();

    }
}
