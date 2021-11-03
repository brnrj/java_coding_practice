package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {
    Queue<String> fila = new LinkedList<>();
    // Offer e Add -> Adicionam elementos na fila
    // Diferença é o comportamento quando a fila está cheia
    fila.add("Ana");// Retorna false
    fila.offer("Bia"); // Lança uma exceção
    fila.add("Carlos");
    fila.offer("Daniel");
    fila.add("Rafaela");
    fila.offer("Gui");

    //Peek e Element -> retornam o próximo elemento da fila sem remove-los
    //diferença é o comportamento quando a fila está vazia
    System.out.println(fila.peek()); //retorna null se a fila estiver vazia
    System.out.println(fila.peek());
    System.out.println(fila.element());//retorna um erro(exceção) se a fila estiver vazia
    System.out.println(fila.element());

    //poll & remove -> removem o próximo elemento e removem
    //a diferença de comportamento ocorre quando a fila está vazia
    System.out.println(fila.poll()); //retorna false
    System.out.println(fila.remove()); // Lança uma exceção
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.remove());

    System.out.println(fila.size());
    // fila.clear();
    System.out.println(fila.isEmpty());
    // fila.contains(arg0)
  }
}
