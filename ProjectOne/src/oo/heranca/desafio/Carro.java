package oo.heranca.desafio;

public class Carro {

  private int delta = 5;
  int VELOCIDADE_MAXIMA;
  String name;
  int velocidade = 0;

  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  Carro(int velocidadeMaxima) {
    this.VELOCIDADE_MAXIMA = velocidadeMaxima;
  }

  void acelerar() {
    if(velocidade + getDelta() > VELOCIDADE_MAXIMA){
      this.velocidade = VELOCIDADE_MAXIMA;
    }
    velocidade += getDelta();
  }

  void frear() {
    if (velocidade == 0) {
      velocidade = 0;
    }
    velocidade -= delta;
  }
}
