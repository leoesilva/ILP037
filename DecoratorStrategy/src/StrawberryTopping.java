
/**
 * Classe que representa uma cobertura de morango para sorvete.
 * Esta classe estende a classe Topping e adiciona a funcionalidade de cobertura
 * de morango ao sorvete.
 */
public class StrawberryTopping extends Topping {

    /**
     * Construtor da classe StrawberryTopping.
     * Cria uma nova instância de StrawberryTopping com base no sorvete passado como
     * parâmetro.
     * @param iceCream O sorvete ao qual a cobertura de morango será adicionada.
     */
    public StrawberryTopping(Item iceCream) {
        super(iceCream);
    }

    /**
     * Obtém a descrição do sorvete com a cobertura de morango.
     * @return A descrição do sorvete com a cobertura de morango.
     */
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + cobertura de morango";
    }

    /**
     * * Obtém o preço do sorvete com a cobertura de morango.
     * @return O preço do sorvete com a cobertura de morango.
     */
    @Override
    public double getPrice() {
        return 1.5 + iceCream.getPrice();
    }

}
