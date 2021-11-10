package oo.abstrato;

public class TesteAbstrato {
  public static void main(String[] args) {
    Cachorro pudim = new Cachorro();
    System.out.println(pudim.mover());
    System.err.println(pudim.mamar());
    System.out.println(pudim.respirar());
  }
}
