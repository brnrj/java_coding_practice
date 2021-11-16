package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
  public static void main(String[] args) {
    Produto p1 = new Produto("Notebook", 3999.99, 0.10);
    Produto p2 = new Produto("Teclado", 399.99, 0.25);
    Produto p3 = new Produto("Mouse", 199.99, 0.15);
    Produto p4 = new Produto("SSD", 399.99, 0.10);
    Produto p5 = new Produto("Memoria Ram", 299.99, 0.15);
    Produto p6 = new Produto("Monitor", 1999.99, 0.08);

    List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

    Predicate<Produto> descontoMaiorQueDez = d -> d.desconto > 0.10;
    Predicate<Produto> precoMenorQueTrezentos = p -> p.preco < 300;
    Function<Produto, String> megaDesconto = m -> "O produto " + m.nome + " está em MEGADESCONTO pelo preço " + (m.preco * 1 - m.desconto);

    produtos.stream()
        .filter(descontoMaiorQueDez)
        .filter(precoMenorQueTrezentos)
        .map(megaDesconto)
        .forEach(System.out::println);
  }
}
