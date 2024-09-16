
/**
 * Classe que representa um sorvete de morango.
 */
public class StrawberryIceCream implements Item {

    /**
     * Retorna a descrição do sorvete de morango.
     * @return A descrição do sorvete de morango.
     */
    @Override
    public String getDescription() {
        return "Sorvete de morango";
    }

    /**
     * Retorna o preço do sorvete de morango.
     * @return O preço do sorvete de morango.
     */
    @Override
    public double getPrice() {
        return 8.0;
    }

}
