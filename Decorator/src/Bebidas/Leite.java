package Bebidas;

public class Leite extends Adicional {
    public Leite(Bebida bebida) {
        super("Leite", bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + leite";
    }

    @Override
    public double preco() {
        return bebida.preco() + 1;
    }

}
