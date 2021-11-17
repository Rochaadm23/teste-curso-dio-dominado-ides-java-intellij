package br.com.dio.estoque;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TesteEstoque {
    public static void main(String[] args) {


        Produto p1 = new Produto("Notebook", 4899.89, 0.12, 20.00, 0001);
        Produto p2 = new Produto("Mouse", 80.00, 0.45, 15.00, 0002);
        Produto p3 = new Produto("Ipad", 3500.00, 0.35, 15.00, 0003);
        Produto p4 = new Produto("Suporte", 120.00, 0.40, 20.00, 0004);
        Produto p5 = new Produto("Tv 45", 5000.00, 0.32, 59.00, 0005);
        Produto p6 = new Produto("relogio", 1900.00, 0.50, 15.00, 0005);
        Produto p7 = new Produto("Monitor", 800.00, 0.38, 59.00, 0005);

        List<Produto> estoque = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
        Predicate<Produto> produtoRelevante = p -> p.preco >= 500;

        Function<Produto, String> msg = p -> " Aproveite!! " + p.nome + " Por R$ " + p.preco;

        estoque.stream()
                .filter(superPromocao)
                    //.filter(freteGratis)
                        .filter(produtoRelevante)
                            .map(msg)
                                .forEach(System.out::println);


    }
}
