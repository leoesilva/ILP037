package Bebidas;

public abstract class Adicional extends Bebida {
    protected Bebida bebida;

    public Adicional(String descricao, Bebida bebida) {
        super(descricao);
        this.bebida = bebida;
    }

    public abstract String getDescricao();
}
