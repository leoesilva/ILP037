/**
 * Classe que representa um sorvete de baunilha.
 */

public class VanillaIceCream implements Item {

    /**
     * Obtém a descrição do sorvete de baunilha.
     * @return A descrição do sorvete de baunilha.
     */
    @Override
    public String getDescription() {
        return "Sorvete de baunilha";
    }

    /**
     * Obtém o preço do sorvete de baunilha.
     * @return O preço do sorvete de baunilha.
     */
    @Override
    public double getPrice() {
        return 7.0;
    }

}
