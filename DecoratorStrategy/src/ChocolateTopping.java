/**
 * Classe que representa uma cobertura de chocolate para sorvete.
 * Esta classe estende a classe Topping e adiciona a funcionalidade de cobertura
 * de chocolate ao sorvete.
 */
public class ChocolateTopping extends Topping {
    /**
     * Construtor da classe ChocolateTopping.
     * Cria uma nova instância de ChocolateTopping com base no sorvete passado como
     * parâmetro.
     * @param iceCream O sorvete ao qual a cobertura de chocolate será adicionada.
     */
    public ChocolateTopping(Item iceCream) {
        super(iceCream);
    }

    /**
     * Obtém a descrição do sorvete com a cobertura de chocolate.
     * @return A descrição do sorvete com a cobertura de chocolate.
     */
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + cobertura de chocolate";
    }

    /**
     * Obtém o preço do sorvete com a cobertura de chocolate.
     * @return O preço do sorvete com a cobertura de chocolate.
     */
    @Override
    public double getPrice() {
        return 2.0 + iceCream.getPrice();
    }

}
