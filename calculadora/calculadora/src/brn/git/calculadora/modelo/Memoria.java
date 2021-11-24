package brn.git.calculadora.modelo;

public class Memoria {
  
  private static Memoria instancia = new Memoria();

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
}
