package L2_01;

//classe abstrata que as demais devem herdar

public abstract class Pessoa
{
    private String nome;
    private String email;
    private String telefone;
    
    //BUILDERS
    
    public Pessoa(String nome, String email, String telefone)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    public Pessoa(String nome, String email)
    {
        this(nome, email, "NaN");
    }
    public Pessoa(String nome)
    {
        this(nome, "NaN", "NaN");
    }
    public Pessoa()
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