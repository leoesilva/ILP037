package Simulador;

import java.util.Random;
import java.util.Scanner;

public class AtacarSozinho implements Estrategia {
    Scanner input = new Scanner(System.in);

    @Override
    public void agir(Pais agressor, Pais adversario) {
        int qtdInicialSoldados = adversario.getQtdSoldados();
        if (plantarEvidenciasFalsas()) {
            System.out.println("Evidência falsa plantada com sucesso!");
            int perdaCredibilidade = (int) (adversario.getCredibilidade() - (adversario.getCredibilidade() * 0.2));
            adversario.setCredibilidade(perdaCredibilidade);
            while (adversario.getQtdSoldados() > (qtdInicialSoldados * 0.3)) {
                soltarBombas();
            }
            derrubarGoverno();
        } else {
            int perdaCredibilidade = (int) (agressor.getCredibilidade() - (agressor.getCredibilidade() * 0.3));
            agressor.setCredibilidade(perdaCredibilidade);
            System.out.println("Evidência falsa falhou. Deseja atacar mesmo assim? (S/N): ");
            char desejaAtacar = input.next().charAt(0);
            if (desejaAtacar == 'S') {
                while (adversario.getQtdSoldados() > (qtdInicialSoldados * 0.3)) {
                    soltarBombas();
                }
                derrubarGoverno();
            } else {
                System.out.println("Aguardando ação...");
            }
        }
    }

    private boolean plantarEvidenciasFalsas() {
        Random tentativa = new Random();
        return tentativa.nextBoolean();
    }

    private void soltarBombas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'soltarBombas'");
    }

    private void derrubarGoverno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'derrubarGoverno'");
    }

    

}
