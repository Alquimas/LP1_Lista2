package L2_01;

public class Aluno extends Pessoa
{
    private String matricula;
    private Responsavel myResponsavel;
    
    //BUILDERS
    
    public Aluno(String nome, String email, String telefone, String matricula, 
    Responsavel myResponsavel)
    {
        super(nome, email, telefone);
        this.matricula = matricula;
        this.myResponsavel = myResponsavel;
    }
    public Aluno(String nome, String email, String matricula, Responsavel myResponsavel)
    {
        this(nome, email, "NaN", matricula, myResponsavel);
    }
    public Aluno(String nome,  String matricula, Responsavel myResponsavel)
    {
        this(nome, "NaN", "NaN", matricula, myResponsavel);
    }
    public Aluno()
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