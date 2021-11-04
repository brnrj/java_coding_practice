package oo.composicao;

public class CursoTeste {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("João");
    Aluno aluno2 = new Aluno("Pedro");
    Aluno aluno3 = new Aluno("Carmela");

    Curso curso1 = new Curso("Java Completo");
    Curso curso2 = new Curso("JavaScript Completo");
    Curso curso3 = new Curso("Python Completo");

    curso1.adicionarAluno(aluno1);
    curso1.adicionarAluno(aluno2);

    curso2.adicionarAluno(aluno1);
    curso2.adicionarAluno(aluno3);

    aluno1.adicionarCurso(curso3);
    aluno2.adicionarCurso(curso3);
    aluno3.adicionarCurso(curso3);

    for(Aluno aluno: curso1.alunos) {
      System.out.println("Estou matriculado no curso " + curso1.nome);
      System.out.println("meu nome é: " + aluno.nome);
      System.out.println();
    }
    System.out.println(aluno1.cursos.get(2).alunos);

    Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
    if(cursoEncontrado != null) {
      System.out.println(cursoEncontrado.nome);
      System.out.println(cursoEncontrado.alunos);
    }
  }
}
