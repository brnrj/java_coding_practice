package brn.git.calculadora.visao;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
  public Calculadora() {

    organizarLayout();
    setSize(232, 322); // define o tamanho do JFrame
    // setUndecorated(true); tirar a barra do sistema
    setLocationRelativeTo(null); // posiciona no centro do monitor
    setDefaultCloseOperation(EXIT_ON_CLOSE); // encerra a aplicação quando a calculadora é fechada
    setVisible(true);
  }

  private void organizarLayout() {
    setLayout(new BorderLayout());

    Display display = new Display();
    display.setPreferredSize(new Dimension(233, 60));
    add(display, BorderLayout.NORTH);

    Teclado teclado = new Teclado();
    add(teclado, BorderLayout.CENTER);

  }
  public static void main(String[] args) {
    new Calculadora();
  }
}
