package Simulador;

public class Pais {

    private final String nome;
    private final int qtdSoldados;
    private final boolean temArmasNucleares;
    private Estrategia estrategia;

    public Pais(String nome, int qtdSoldados, boolean temArmasNucleares) {
        this.nome = nome;
        this.qtdSoldados = qtdSoldados;
        this.temArmasNucleares = temArmasNucleares;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdSoldados() {
        return qtdSoldados;
    }

    public boolean isTemArmasNucleares() {
        return temArmasNucleares;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void declararGuerra(Pais inimigo) {
        this.estrategia.atacar(inimigo);
        this.estrategia.concluir(inimigo);
    }

}
