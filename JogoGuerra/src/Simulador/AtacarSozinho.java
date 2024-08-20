package Simulador;

import java.util.Random;
import java.util.Scanner;

public class AtacarSozinho implements Estrategia {
    Scanner input = new Scanner(System.in);
    @Override
    public void agir(Pais adversario) {
        int qtdInicialSoldados = adversario.getQtdSoldados();
        if(plantarEvidenciasFalsas()) {
            System.out.println("Evidência falsa plantada com sucesso!");
            while (adversario.getQtdSoldados() > (qtdInicialSoldados * 0.3)) {
                soltarBombas();
            }
            derrubarGoverno();
        } else {
            System.out.println("Evidência falsa falhou. Deseja atacar mesmo assim? (S/N): ");
            char desejaAtacar = input.next().charAt(0);
            if(desejaAtacar == 'S') {
                while (adversario.getQtdSoldados() > (qtdInicialSoldados * 0.3)) {
                    soltarBombas();
                }
            } else {
                System.out.println("Aguardando ação...");
            }
        }
    }

    private void derrubarGoverno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'derrubarGoverno'");
    }

    private void soltarBombas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'soltarBombas'");
    }

    private boolean plantarEvidenciasFalsas() {
        Random tentativa = new Random();
        return tentativa.nextBoolean();
    }

}
