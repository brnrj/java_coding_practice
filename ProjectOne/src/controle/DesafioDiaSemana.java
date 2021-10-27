package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o dia da semana: ");

    String diaSemana = entrada.next().toLowerCase();

    if("domingo".equals(diaSemana)) {
      System.out.println("Dia: 1");
    } else if("segunda".equals(diaSemana)) {
      System.out.println("Dia: 2");
    } else if("terça".equals(diaSemana)) {
      System.out.println("Dia: 1");
    } else if("quarta".equals(diaSemana)) {
      System.out.println("Dia: 3");
    } else if("quinta".equals(diaSemana)) {
      System.out.println("Dia: 4");
    } else if("sexta".equals(diaSemana)) {
      System.out.println("Dia: 5");
    } else if("sabado".equals(diaSemana)){
      System.out.println("Dia: 6");
    } else {
      System.out.println("Dia da semana inválido!");
    }
    entrada.close();
  }
}
