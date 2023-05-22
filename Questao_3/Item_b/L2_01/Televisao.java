package L2_01;

public class Televisao 
{
    private int volume;
    private int canal;

//BUILDERS
    public Televisao(int volume, int canal)
    {
        this.volume = volume;
        this.canal = canal;
    }

    public Televisao(int canal)
    {
        this(0, canal);
    }

    public Televisao()
    {
        this(0, 1);
    }

    //METODOS
    public int getVolume()
    {
        return this.volume;
    }

    public int getCanal()
    {
        return this.canal;
    }

    //permissao default: acesso permitido apenas para a classe
    //um usuario instanciando um TV na main nao pode usar esses metodos

    void changeVolume(int i)
    {
        this.volume = i;
    }

    void changeCanal(int i)
    {
        this.canal = i;
    }
}