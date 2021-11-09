package oo.heranca.desafio;

public class Corrida {
  public static void main(String[] args) {
    Civic civic = new Civic();
    Ferrari ferrari = new Ferrari();

    System.out.println("Velocidade do Honda Civic => " + civic.velocidade + "km/h");
    System.out.println("Velocidade da Ferrari => " + ferrari.velocidade + "km/h");

    ferrari.acelerar();
    ferrari.acelerar();
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

  }
}
