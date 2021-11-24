package brn.git.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
  
  private static Memoria instancia = new Memoria();

  private final List<MemoriaObservador> observadores = new ArrayList<>();

  private String textoAtual = "";

  public String getTextoAtual() {
    return textoAtual.isEmpty() ? "0" : textoAtual;
  }

  public void setTextoAtual(String textoAtual) {
    this.textoAtual = textoAtual;
  }

  private Memoria() {

  }

  public static Memoria getInstancia() {
    return instancia;
  }

  public void adicionarObservador(MemoriaObservador observador) {
    observadores.add(observador);
  }

  public void processarComando(String valor) {
    if("AC".equals(valor)){
      textoAtual = "";
    } else {
      textoAtual += valor;
    }
    observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
  }
}
