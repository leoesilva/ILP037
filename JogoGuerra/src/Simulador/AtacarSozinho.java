package Simulador;

public class AtacarSozinho implements Estrategia {

    @Override
    public void atacar(Pais inimigo) {
        // TODO Auto-generated method stub
        System.out.println("\nPlantar evidências falsas.\nSoltar bombas.\nDerrubar governo.");
    }

    @Override
    public void concluir(Pais inimigo) {
        // TODO Auto-generated method stub
        System.out.println("\nEstabelecer novo governo.");
    }

}
