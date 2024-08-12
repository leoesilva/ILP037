package Simulador;

public class Diplomacia implements Estrategia {

    @Override
    public void atacar(Pais inimigo) {
        // TODO Auto-generated method stub
        System.out.println("\nRecuar tropas.\nPropor cooperação econômica.");
    }

    @Override
    public void concluir(Pais inimigo) {
        // TODO Auto-generated method stub
        System.out.println("\nPropor desarmamento.");
    }

}
