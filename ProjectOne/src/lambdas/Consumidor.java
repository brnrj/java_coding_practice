package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
  public static void main(String[] args) {
    Consumer<Produto> imprimirNome = ((produto) -> System.out.println(produto.nome + "!!!!"));

    Produto p1 = new Produto("Caneta", 15, 0.5);
    imprimirNome.accept(p1);
    
    Produto p2 = new Produto("Notebook", 3405.99, 0.5);
    Produto p3 = new Produto("Borracha", 5, 0.5);
    Produto p4 = new Produto("Estojo", 35, 0.5);
    Produto p5 = new Produto("Régua", 7.5, 0.5);
    Produto p6 = new Produto("Lápis", 1.5, 0.5);

    List<Produto> produtos = Arrays.asList(p1, p2, p3 , p4, p5, p6);

    produtos.forEach(imprimirNome);
    produtos.forEach((prod) -> System.out.println(prod.preco));
    produtos.forEach(System.out::println);
  }
}
