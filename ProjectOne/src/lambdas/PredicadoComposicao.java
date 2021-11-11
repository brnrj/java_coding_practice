package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
  public static void main(String[] args) {
    Predicate<Integer> isPar = (num) -> num % 2 == 0;
    Predicate<Integer> isTredDigitos = (num) -> num >= 100 && num <= 999;
    
    System.out.println(isPar.and(isTredDigitos).negate().test(34));
    System.out.println(isPar.or(isTredDigitos).test(34));
  }
}
