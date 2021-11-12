package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato1 = new Gato("BArtolomeu", "Dalmata", 4);
        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

        System.out.println(gato1.getNome());
        System.out.println(gato1.getCor());
        System.out.println(gato1.getIdade());

        Gato gato2 = new Gato("BArtolomeu", "Dalmata", 4);
        gato2.setNome("Milhouse");
        gato2.setCor("Amarelo");
        gato2.setIdade(2);
        System.out.println(gato2.getNome());
        System.out.println(gato2.getCor());
        System.out.println(gato2.getIdade());

    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}