package oo.heranca.desafio;

public class Ferrari extends Carro {

  Ferrari(int velocidadeMaxima) {
    super(velocidadeMaxima);
  }
  void acelerar() {
    super.acelerar();
    super.acelerar();
    super.acelerar();
  }
}
