package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
  public static void main(String[] args) {
    Produto p = new Produto("Ipad", 5000.97, 0.05);

    Function<Produto, Double> precoReal = (produto) -> produto.preco * (1 - produto.desconto);

    UnaryOperator<Double> pagaImposto = (value) -> value >= 2500 ? value * (1 + 0.085) : value;

    UnaryOperator<Double> pagaFrete = (valor) -> valor >= 3000 ? valor + 100 : valor + 50;

    UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));

    Function<Double, String> formatar = (preco) -> ("R$" + preco).replace(".", ",");

    String preco = precoReal
    .andThen(pagaImposto)
    .andThen(pagaFrete)
    .andThen(arredondar)
    .andThen(formatar)
    .apply(p);
    System.out.println(preco);
  }
}
