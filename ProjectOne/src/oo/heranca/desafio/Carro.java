package oo.heranca.desafio;

public class Carro {
  int VELOCIDADE_MAXIMA;
  String name;
  int velocidade = 0;

  Carro(int velocidadeMaxima) {
    this.VELOCIDADE_MAXIMA = velocidadeMaxima;
  }

  void acelerar() {
    if(velocidade + 5 > VELOCIDADE_MAXIMA){
      this.velocidade = VELOCIDADE_MAXIMA;
    }
    velocidade += 5;
  }

  void frear() {
    if (velocidade == 0) {
      velocidade = 0;
    }
    velocidade -= 5;
  }
}
