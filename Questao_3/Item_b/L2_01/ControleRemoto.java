package L2_01;

public abstract class ControleRemoto 
{
    //supondo uma televisao com volume entre 0 e 100

    public static void mudarVolume(Televisao tv, boolean aumentar)
    {
        if(aumentar)
        {
            tv.changeVolume(Math.min(tv.getVolume() + 1, 100));
        }
        else
        {
            tv.changeVolume(Math.max(tv.getVolume() - 1, 0));
        }
        //nao ha exibicao numa tentativa de se extrapolar os limites
        //assim como numa tv real a unica coisa que ocorrer e manter
        //o valor
    }
    public static void mudarCanal(Televisao tv, boolean aumentar)
    {
        if(aumentar)
        {
            tv.changeCanal(Math.min(tv.getCanal() + 1, 1200));
        }
        else
        {
            tv.changeCanal(Math.max(tv.getCanal() - 1, 1));
        }
        //nao ha exibicao numa tentativa de se extrapolar os limites
        //assim como numa tv real a unica coisa que ocorrer e manter
        //o valor
    }
    public static void definirCanal(Televisao tv, int i)
    {
        if(i < 1 || i > 1200)
        {
            return;
        }

        //nao ha exibicao numa tentativa de se extrapolar os limites
        //assim como numa tv real a unica coisa que ocorrer e manter
        //o valor
        //Nesse caso, ha uma clausura na main que so deixa passar valores nesse escopo
        
        tv.changeCanal(i);
    }
    public static int[] getInfo(Televisao tv)
    {
        int[] retorno = {tv.getVolume(), tv.getCanal()};
        return retorno;
    }
}