package exercicio03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio03 {

    public static void main(String[] args) {

        Map<String, Double> map = null;
        // TODO: implemente a criação do Map com a política de descontos do Site da empresa

        List<Produto> produtos = getProdutosCadastradosNoSite(map);

        imprimeListaDeProdutosDoSite(produtos);

    }

    private static List<Produto> getProdutosCadastradosNoSite(Map<String, Double> map) {

        List<Produto> produtos = new ArrayList<>();

        try {
            produtos.add(new Medicamento(1, "PREDSIM 20MG 10 COMPRIMIDOS 12G", 28.02, map.get("MEDICAMENTO")));
        } catch (ValorDePrecoOuDescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            produtos.add(new Medicamento(2, "CATAFLAMPRO EMULGEL 150G", 43.38, map.get("MEDICAMENTO")));
        } catch (ValorDePrecoOuDescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            produtos.add(new OTC(3, "EPOCLER 6 FLACONETES COM 10ML CADA", 14.86, 13.49, map.get("OTC")));
        } catch (ValorDePrecoOuDescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            produtos.add(new OTC(4, "LACRIMA PLUS 15ML 28G", 21.38, 19.19, map.get("OTC")));
        } catch (ValorDePrecoOuDescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            produtos.add(new Perfumaria(5, "ESCOVA PARA CABELOS FLEX HAIR 118", 38.79, 36.59, 3, 34.90, map.get("PERFUMARIA")));
        } catch (ValorDePrecoOuDescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            produtos.add(new Perfumaria(6, "SABONETE ESFOLIANTE FACIAL NEEDS 100G", 21.59, 18.89, 2, 15.99, map.get("PERFUMARIA")));
        } catch (ValorDePrecoOuDescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            produtos.add(new Perfumaria(7, "KIT SOBRANCELHA BELLIZ 1 UNIDADE", 30.51, -25.99, 1, 30.51, map.get("PERFUMARIA")));
        } catch (ValorDePrecoOuDescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }

    private static void imprimeListaDeProdutosDoSite(List<Produto> produtos) {
        System.out.println("Lista de Preços dos Produtos do Site:");
        for(Produto produto : produtos) {
            System.out.println(produto.getId()+"|"+produto.getNome()+": Preço de Venda DE "+produto.getPreco()+ " POR "+produto.getPrecoPromocao());
        }
    }


}
