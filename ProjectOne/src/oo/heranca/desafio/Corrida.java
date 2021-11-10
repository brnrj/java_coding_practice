package oo.heranca.desafio;

public class Corrida {
  public static void main(String[] args) {
    Civic civic = new Civic(240);
    Ferrari ferrari = new Ferrari(330);

    System.out.println("Velocidade do Honda Civic => " + civic.velocidade + "km/h");
    System.out.println("Velocidade da Ferrari => " + ferrari.velocidade + "km/h");

    ferrari.acelerar();
    ferrari.ligarTurbo();
    ferrari.acelerar();
    ferrari.desligarTurbo();
    ferrari.acelerar();
    ferrari.acelerar();
    civic.acelerar();
    civic.acelerar();
    civic.acelerar();
    civic.acelerar();
    civic.acelerar();

    System.out.println("Velocidade do Honda Civic => " + civic.velocidade + "km/h");
    System.out.println("Velocidade da Ferrari => " + ferrari.velocidade + "km/h");


    ferrari.frear();
    ferrari.frear();
    ferrari.frear();
    civic.frear();
    civic.frear();

    System.out.println("Velocidade do Honda Civic => " + civic.velocidade + "km/h");
    System.out.println("Velocidade da Ferrari => " + ferrari.velocidade + "km/h");

    System.out.println(ferrari.velocidadeDoAr());

  }
}
