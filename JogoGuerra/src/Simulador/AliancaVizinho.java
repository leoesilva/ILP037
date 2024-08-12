package Simulador;

public class AliancaVizinho implements Estrategia {

    @Override
    public void atacar(Pais inimigo) {
        // TODO Auto-generated method stub
        System.out.println("\nVizinho ataca pelo Norte e nós atacamos pelo Sul.");
    }

    @Override
    public void concluir(Pais inimigo) {
        // TODO Auto-generated method stub
        System.out.println("\nDividimos os espólios.");
    }

}
