package oo.heranca.desafio;

public class Carro {
  String name;
  int velocidade = 0;

  void acelerar() {
    velocidade += 5;
  }

  void frear() {
    if (velocidade == 0) {
      velocidade = 0;
    }
    velocidade -= 5;
  }
}
