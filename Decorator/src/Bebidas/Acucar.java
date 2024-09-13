package Bebidas;

public class Acucar extends Adicional {
    public Acucar(Bebida bebida) {
        super("Açúcar", bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + açúcar";
    }

    @Override
    public double preco() {
        return bebida.preco() + 0.5;
    }

}
