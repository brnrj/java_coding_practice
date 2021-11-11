package oo.heranca.desafio;

public interface Luxo {
  void ligarAr();
  void desligarAr();
  // Possibilidade de uma implementação padrão dentro de uma interface
  default int velocidadeDoAr() {
    return 1;
  }
}
