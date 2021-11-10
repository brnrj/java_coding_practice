package oo.encapsulamento;

public class PessoaTeste {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("João", "Maria", 50);
    p1.setIdade(99);
      System.out.println(p1.getIdade());
      System.out.println(p1);
      System.out.println(p1.getNomeCompleto());
  }
}
