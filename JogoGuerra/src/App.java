
import Simulador.*;

public class App {

    public static void main(String[] args) throws Exception {
        Pais agressor = new Pais("Sudão do Sul", 150, false);
        Pais agredido = new Pais("Coreia do Norte", 30000, true);

        if (agressor.getQtdSoldados() > agredido.getQtdSoldados()) {
            agressor.setEstrategia(new AtacarSozinho());
        } else if (agressor.getQtdSoldados() < agredido.getQtdSoldados()) {            
            agressor.setEstrategia(new AliancaVizinho());
        } else {
            agressor.setEstrategia(new Diplomacia());
        }
        agressor.declararGuerra(agredido);
    }
}
