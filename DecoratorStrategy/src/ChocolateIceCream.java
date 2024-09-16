
/**
 * Classe que representa um sorvete de chocolate.
 */
public class ChocolateIceCream implements Item {
    
    /**
     * Obtém a descrição do sorvete de chocolate.
     * @return A descrição do sorvete de chocolate.
     */
    @Override
    public String getDescription() {
        return "Sorvete de chocolate";
    }

    /**
     * Obtém o preço do sorvete de chocolate.
     * @return O preço do sorvete de chocolate.
     */
    @Override
    public double getPrice() {
        return 10.0;
    }

}
