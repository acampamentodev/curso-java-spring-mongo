package entidade;

import enums.Categoria;

public class Produto {

    private String nome;
    private double preco;
    private Categoria categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getComissao() {
        return getPreco() * getCategoria().getPercentualDeComissao() / 100;
    }

    @Override
    public String toString() {
        return String.format(
                "O produto %s tem valor %s faz parte da categoria %s e gera uma comissão de %s",
                getNome(),
                getPreco(),
                getCategoria(),
                getComissao()
        );
    }
}
