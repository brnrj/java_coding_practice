package generics;

public class ParesTeste {
  public static void main(String[] args) {
    Pares<Integer, String> resultadoConcurso = new Pares<>();

    resultadoConcurso.adicionar(1, "Carmela");
    resultadoConcurso.adicionar(2, "Bruno");
    resultadoConcurso.adicionar(3, "José");
    resultadoConcurso.adicionar(4, "Frederico");
    resultadoConcurso.adicionar(2, "João");
    
    System.out.println(resultadoConcurso.getValor(1));
    System.out.println(resultadoConcurso.getValor(4));
    System.out.println(resultadoConcurso.getValor(2));
  }
}
