package arrays;

import java.util.Scanner;

public class DesafioArray {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Quantas notas serão inseridas? ");
    int arrayLength = entrada.nextInt();
    
    double[] notasAluno = new double[arrayLength];
    for (int i = 0; i < notasAluno.length; i++) {
      System.out.print("Digite a nota " + (i + 1) + ": ");
      notasAluno[i] = entrada.nextDouble();
    }
    
    double totalNotasAluno = 0;
    for(double nota: notasAluno) {
      totalNotasAluno += nota;
    }

    double media = totalNotasAluno / arrayLength;
    System.out.println("A média do aluno é " + media);

    entrada.close();
  }  
}
