package streams;

public class Aluno {
  final String name;
  final double nota;
  final boolean bomComportamento;
  
  public Aluno(String name, double nota) {
    this(name, nota, true);
  }

  public Aluno(String name, double nota, boolean bomComportamento) {
    this.name = name;
    this.nota = nota;
    this.bomComportamento = bomComportamento;
  }
  
}
