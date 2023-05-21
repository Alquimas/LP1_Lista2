//Podemos adicionar os seguintes métodos dentro da classe turma
public Aluno getAluno(int i)
{
  if(this.numAlunos < i)
  {
    return null;
  }
  return this.myTurma[i];
}

public Aluno getAluno(String s)
{
  for(int i = 0; i < this.numAlunos; i++)
  {
    if(s.equals(this.myTurma[i].getNome() || s.equals(this.myTurma[i].getResponsavel().getNome()))
       return this.myTurma[i];
  }
  return null;
}
       
//esses métodos buscam um aluno e o retornam caso ele tenha o indice
//inserido ou tenham o nome ou um responsavel com nome igual ao inserido
//se quisermos uma impressão desses resultados na tela, implementamos o
//seguinte

public void imprimeAluno(int i)
{
  if(this.getAluno(i) == null)
  {
   System.out.println("Aluno não encontrado");
   return;
  }
  System.out.println("Dados do aluno:\n");
  System.out.println("Nome: " + myTurma[i].getNome());
  System.out.println("Matricula: " + myTurma[i].getMatricula());
  System.out.println("Email: " + myTurma[i].getEmail());
  System.out.println("Telefone: " + myTurma[i].getTelefone());
  System.out.println("###############################################");
}

public void imprimeAluno(String s)
{
  if(this.getAluno(s) == null)
  {
   System.out.println("Aluno não encontrado");
   return;
  }
  Aluno curr = this.getAluno(s);
  if(curr.getNome().equals(s))
  {
    System.out.println("Dados do aluno:\n");
    System.out.println("Nome: " + curr.getNome());
    System.out.println("Matricula: " + curr.getMatricula());
    System.out.println("Email: " + curr.getEmail());
    System.out.println("Telefone: " + curr.getTelefone());
    System.out.println("###############################################");
  }
  else
  {
     System.out.println("Dados do responsavel:\n");
     System.out.println("Nome do aluno: " + curr.getNome());
     System.out.println("Nome do responsavel: " + curr.getResponsavel().getNome());
     System.out.println("Email: " + curr.getResponsavel().getEmail());
     System.out.println("Telefone: " + curr.getResponsavel().getTelefone());
     System.out.println("###############################################");
  }
}
