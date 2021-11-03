package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
  public static void main(String[] args) {
    
    SortedSet<String> listaAprovados = new TreeSet<>();
    listaAprovados.add("Bruno");
    listaAprovados.add("Carmela");
    listaAprovados.add("João");
    listaAprovados.add("Joana");

    for(String candidato: listaAprovados) {
      System.out.println(candidato);
    }

    Set<String> lista = new HashSet<>();
    lista.add("Bruno");
    lista.add("Carmela");
    lista.add("João");
    lista.add("Joana");

    for(String candidato: lista) {
      System.out.println(candidato);
    }
  }
}
