package streams;

public class Aluno {
  final String name;
  final double nota;
  final boolean bomComportamento;
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (bomComportamento ? 1231 : 1237);
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(nota);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aluno other = (Aluno) obj;
    if (bomComportamento != other.bomComportamento)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
      return false;
    return true;
  }

  public Aluno(String name, double nota) {
    this(name, nota, true);
  }

  public Aluno(String name, double nota, boolean bomComportamento) {
    this.name = name;
    this.nota = nota;
    this.bomComportamento = bomComportamento;
  }
  
  public String toString() {
    return name + " tem nota " + nota;
  }
}
