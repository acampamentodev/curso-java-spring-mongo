package enums;

public enum Categoria {
    ELETRODOMESTICO("Eletrodoméstico", 3),
    MOVEIS("Móveis", 5),
    PORTATEIS("Portáteis", 2),
    INFORMATICA("Informática", 1),
    CAMA_MESA_E_BANHO("Cama, mesa e banho", 10);

    private final String nome;
    private final double percentualDeComissao;

    Categoria(String nome, double percentualDeComissao) {
        this.nome = nome;
        this.percentualDeComissao = percentualDeComissao;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualDeComissao() {
        return percentualDeComissao;
    }
}
