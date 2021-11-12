package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato1 = new Gato("BArtolomeu", "Dalmata", 4);


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
