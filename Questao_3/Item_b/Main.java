import java.io.*;
import java.util.*;
import L2_01.*;

class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Televisao myTv = new Televisao();
        while(true)
        {
            System.out.println("\nSelecione uma opção:\n");
            System.out.println("1. Mostrar info:\n");
            System.out.println("2. Aumentar volume\n");
            System.out.println("3. Diminiuir volume\n");
            System.out.println("4. Próximo canal\n");
            System.out.println("5. Canal anterior\n");
            System.out.println("6. Ir para canal\n");
            System.out.println("7. Finalizar\n");

            String s = sc.next();

            sc.nextLine();

            int option;

            try
            {
                option = Integer.valueOf(s);
            }
            catch(NumberFormatException error)
            {
                System.out.println("\nOpção inválida!\n");
                continue;
            }

            switch(option)
            {
                case 1:
                {
                    System.out.println("\n##############################");
                    System.out.println("Informações da TV:\n");
                    System.out.println("Canal: " + myTv.getCanal());
                    System.out.println("Volume: " + myTv.getVolume());
                    break;
                }
                case 2:
                {
                    ControleRemoto.mudarVolume(myTv, true);
                    System.out.println("\n##############################");
                    System.out.println("Volume aumentado com sucesso!\n");
                    break;
                }
                case 3:
                {
                    ControleRemoto.mudarVolume(myTv, false);
                    System.out.println("\n##############################");
                    System.out.println("Volume diminuido com sucesso!\n");
                    break;
                }
                case 4:
                {
                    ControleRemoto.mudarCanal(myTv, true);
                    System.out.println("\n##############################");
                    System.out.println("Canal avançado com sucesso!\n");
                    break;
                }
                case 5:
                {
                    ControleRemoto.mudarCanal(myTv, false);
                    System.out.println("\n##############################");
                    System.out.println("Canal retornado com sucesso!\n");
                    break;
                }
                case 6:
                {
                    System.out.println("\n##############################");
                    System.out.println("Insira um canal entre 1 e 1200:");

                    int canal;

                    while(true)
                    {
                        s = sc.next();
                        try
                        {
                            canal = Integer.valueOf(s);
                            if(canal < 1 || canal > 1200)
                            {
                                System.out.println("\nValor inválido. Insira um canal entre 1 e 1200:\n");
                                continue;
                            }
                        }
                        catch(NumberFormatException error)
                        {
                            System.out.println("\nValor inválido. Insira um canal entre 1 e 1200:\n");
                            continue;
                        }
                        break;
                    }
                    ControleRemoto.definirCanal(myTv, canal);
                    System.out.println("##############################");
                    System.out.println("Canal definido com sucesso!\n");
                    break;
                }
                case 7:
                {
                    return;
                }
                default:
                {
                    System.out.println("\nOpção inválida!\n");
                    continue;
                }
            }

        }
    }
}