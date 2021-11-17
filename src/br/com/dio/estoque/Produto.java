package br.com.dio.estoque;

public class Produto {
   final String nome;
    final Double preco;
    final Double desconto;
    final Double valorFrete;
    final Integer numeroPatrimonio;

    public Produto(String nome, Double preco, Double desconto, Double valorFrete, Integer numeroPatrimonio) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
        this.numeroPatrimonio = numeroPatrimonio;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                ", valorFrete=" + valorFrete +
                ", numeroPatrimonio=" + numeroPatrimonio +
                '}';
    }
}
