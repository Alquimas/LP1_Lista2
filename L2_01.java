import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Aluno meuAluno = new Aluno();
		
		System.out.println(meuAluno.getNome() + " " + meuAluno.getEmail() + " " + meuAluno.getTelefone() 
		+ " " + meuAluno.getMatricula());
	}
}

abstract class Pessoa
{
    private String nome;
    private String email;
    private String telefone;
    
    //BUILDERS
    
    Pessoa(String nome, String email, String telefone)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    Pessoa(String nome, String email)
    {
        this(nome, email, "NaN");
    }
    Pessoa(String nome)
    {
        this(nome, "NaN", "NaN");
    }
    Pessoa()
    {
        this("NaN", "NaN", "NaN");
    }
    
    //Metodos
    
    public String getNome()
    {
        return this.nome;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getTelefone()
    {
        return this.telefone;
    }
}
class Aluno extends Pessoa
{
    private String matricula;
    private Responsavel myResponsavel;
    
    //BUILDERS
    
    Aluno(String nome, String email, String telefone, String matricula, 
    Responsavel myResponsavel)
    {
        super(nome, email, telefone);
        this.matricula = matricula;
        this.myResponsavel = myResponsavel;
    }
    Aluno(String nome, String email, String matricula)
    {
        this(nome, email, "NaN", matricula);
    }
    Aluno(String nome,  String matricula)
    {
        this(nome, "NaN", "NaN", matricula);
    }
    Aluno()
    {
        this("NaN", "NaN", "NaN", "NaN");
    }
    
    //Metodos
    public String getMatricula()
    {
        return this.matricula;
    }
}
class Responsavel extends Pessoa
{
    Responsavel(String nome, String email, String telefone)
    {
        super(nome, email, telefone);
    }
    Responsavel(String nome, String email)
    {
        this(nome, email, "NaN");
    }
    Responsavel(String nome)
    {
        this(nome, "NaN", "NaN");
    }
    Responsavel()
    {
        this("NaN", "NaN", "NaN");
    }
}

class Turma
{
    private Alunos[] myTurma;
    private int numAlunos;
    
    Turma(Alunos[] myTurma, int numAlunos)
    {
        for(int i = 0; i < numAlunos; i++)
        {
            this.myTurma[i] = myTurma[i];
        }
        for(int i = numAlunos; i < 10; i++)
        {
            this.myTurma[i] = myTurma[i];
        }
        this.numAlunos = numAlunos;
    }
}
