
/**
 * Interface que representa um item.
 * Um item possui uma descrição e um preço.
 */
public interface Item {

    /**
     * Obtém a descrição do item.
     * @return a descrição do item
     */
    String getDescription();

    /**
     * Obtém o preço do item.
     * @return o preço do item
     */
    double getPrice();

}
