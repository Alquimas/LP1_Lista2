package L2_01;

public class Responsavel extends Pessoa
{
    //BUILDERS
    
    public Responsavel(String nome, String email, String telefone)
    {
        super(nome, email, telefone);
    }
    public Responsavel(String nome, String email)
    {
        this(nome, email, "NaN");
    }
    public Responsavel(String nome)
    {
        this(nome, "NaN", "NaN");
    }
    public Responsavel()
    {
        this("NaN", "NaN", "NaN");
    }
}