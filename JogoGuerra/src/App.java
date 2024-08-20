
import Simulador.AliancaVizinho;
import Simulador.AtacarSozinho;
import Simulador.Diplomacia;
import Simulador.Pais;

public class App {

    public static void main(String[] args) throws Exception {
        Pais agressor = new Pais("País 1", 150000, true, 200000000, 77);
        Pais agredido = new Pais("País 2", 30000, false, 35000000, 32);

        if ((agressor.isTemArmasNucleares() == true && agredido.isTemArmasNucleares() == true)
                || (agressor.getQtdSoldados() == agredido.getQtdSoldados())) {
            agressor.setEstrategia(new Diplomacia());
        } else if (agressor.getQtdSoldados() > agredido.getQtdSoldados()) {
            agressor.setEstrategia(new AtacarSozinho());
        } else {
            agressor.setEstrategia(new AliancaVizinho());
        }
        agressor.declararGuerra(agredido);
    }
}
