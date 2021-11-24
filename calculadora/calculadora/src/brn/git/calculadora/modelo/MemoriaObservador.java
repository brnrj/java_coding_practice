package brn.git.calculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {
  void valorAlterado(String novoValor);
}
