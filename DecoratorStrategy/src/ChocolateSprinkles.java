
/**
 * Classe que representa uma cobertura de chocolate para sorvete.
 * Esta classe estende a classe Topping e adiciona a funcionalidade de cobertura
 * de chocolate ao sorvete.
 */
public class ChocolateSprinkles extends Topping {

    /**
     * Construtor da classe ChocolateSprinkles.
     * @param iceCream o sorvete ao qual os granulados de chocolate serão adicionados.
     */
    public ChocolateSprinkles(Item iceCream) {
        super(iceCream);
    }

    /**
     * Obtém a descrição do sorvete com os granulados de chocolate.
     * 
     * @return a descrição do sorvete com os granulados de chocolate.
     */
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + chocolate granulado";
    }

    /**
     * Obtém o preço do sorvete com os granulados de chocolate. 
     * 
     * @return o preço do sorvete com os granulados de chocolate.
     */

    @Override
    public double getPrice() {
        return 1.0 + iceCream.getPrice();
    }

}
