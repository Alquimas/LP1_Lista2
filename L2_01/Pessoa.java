package L2_01;
import java.util.*;
import java.io.*;

public abstract class Pessoa
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
    
    public Responsavel getResponsavel()
    {
        return this.myResponsavel;
    }
}
class Responsavel extends Pessoa
{
    //BUILDERS
    
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
