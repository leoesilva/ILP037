
/**
 * Classe abstrata que representa uma cobertura para um sorvete.
 * Implementa a interface Item.
 */
public abstract class Topping implements Item {

    protected Item iceCream;
    /**
     * Construtor da classe Topping.
     * @param iceCream o sorvete ao qual a cobertura será adicionada
     */
    public Topping(Item iceCream) {
        this.iceCream = iceCream;
    }

    /**
     * Obtém a descrição do item com a cobertura.
     * @return a descrição do item com a cobertura
     */
    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    /**
     * Obtém o preço do item com a cobertura.
     * @return o preço do item com a cobertura
     */
    @Override
    public double getPrice() {
        return iceCream.getPrice();
    }
}
