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
    Aluno(String nome, String email, String matricula, Responsavel myResponsavel)
    {
        this(nome, email, "NaN", matricula, myResponsavel);
    }
    Aluno(String nome,  String matricula, Responsavel myResponsavel)
    {
        this(nome, "NaN", "NaN", matricula, myResponsavel);
    }
    Aluno()
    {
        this("NaN", "NaN", "NaN", "NaN", null);
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
    private Aluno[] myTurma;
    private int numAlunos;
    
    Turma(Aluno[] myTurma, int numAlunos)
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

abstract class EntradaDados
{
    private final static String[] validEmails = 
    {
        "@gmail.com",
        "@hotmail.com",
        "@outlook.com"
    };
    
    public static boolean VerificaMatricula(String matricula)
    {
        int n = matricula.length();
        
        if(n != 5) return false;
        
        for(int i = 0; i < 5; i++)
            if(matricula.charAt(i) > '9' || matricula.charAt(i) < '0')
                return false;
                
        return true;
    }
    
    public static boolean VerificaEmail(String email)
    {
        if(email.indexOf('@') == -1 || email.indexOf('@') != email.lastIndexOf('@'))
            return false;
            
        int n = email.indexOf('@');
            
        if(email.charAt(0) == '-' || email.charAt(0) == '@' || email.charAt(n-1) == '-')
            return false;
        
        for(int i = 0; i < n; i++)
        {
            char c = email.charAt(i);
            if((c < '0' || c > '9') && (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c != '-'))
                return false;
        }
        
        String s = email.substring(n, email.length());
        
        for(int i = 0; i < 3; i++)
        {
            if(s.equals(validEmails[i]))
                return true;
        }
        
        return false;   
    }
	public static boolean VerificaTelefone(String telefone)
    {
        if(telefone.length() != 11) return false
        
        for(int i = 0; i < 11; i++)
        {
            if(telefone.charAt(i) < '0' || telefone.charAt(i) > '9')
                return false;
        }
        
        return true;
    }
}
