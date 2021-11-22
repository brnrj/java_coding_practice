package brn.git.cm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import brn.git.cm.modelo.Campo;

public class CampoTeste {
  
  private Campo campo = new Campo(3, 3);

  @Test
  void testeVizinhoRealDistancia1() {
    Campo vizinho = new Campo(3, 2);

    boolean resultado = campo.adicionarVizinho(vizinho);

    assertTrue(resultado);
  }
}
