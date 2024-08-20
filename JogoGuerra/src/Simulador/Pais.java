package Simulador;

public class Pais {

    private final String nome;
    private final int qtdSoldados;
    private final boolean temArmasNucleares;
    private final double capacidadeEconomica;
    private int credibilidade;
    private Estrategia estrategia;

    public Pais(String nome, int qtdSoldados, boolean temArmasNucleares, double capacidadeEconomica, int credibilidade) {
        this.nome = nome;
        this.qtdSoldados = qtdSoldados;
        this.temArmasNucleares = temArmasNucleares;
        this.capacidadeEconomica = capacidadeEconomica;
        this.credibilidade = credibilidade;
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

    public double getCapacidadeEconomica() {
        return capacidadeEconomica;
    }

    public int getCredibilidade() {
        return credibilidade;
    }

    public void setCredibilidade (int credibilidade) {
        this.credibilidade = credibilidade;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void declararGuerra(Pais adversario) {
        this.estrategia.agir(this, adversario);        
    }

}
