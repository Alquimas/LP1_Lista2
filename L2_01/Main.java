import java.util.*;
import java.io.*;
import L2_01.*;

public class Main
{
	public static void main(String[] args) {
		
		//Variaveis
		Turma myTurma = new Turma();
		boolean s = true;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		while(s)
		{
		    System.out.println("#######################################");
		    System.out.println("O que deseja fazer?\n");
		    System.out.println("1. Mostrar turma e responsaveis:");
		    System.out.println("2. Mostrar turma");
		    System.out.println("3. Mostrar responsaveis");
		    System.out.println("4. Adicionar aluno");
		    System.out.println("5. Finalizar");
		    String test = sc.next();
		    if(!EntradaDados.VerificaEntradaInt(test))
		    {
		        System.out.println("\n Opção invalida\n");
		        continue;
		    }
		    i = Integer.valueOf(test);
		    switch (i) 
		    {
		        case 1: 
		            {
		                if(myTurma.getSize() == 0)
		                {
		                    System.out.println("Não há ninguém cadastrado até o momento.");
		                    break;
		                }
		                else
		                {
		                    myTurma.imprimeTurma();
		                    break;
		                }
		            }
		        case 2:
		            {
		                if(myTurma.getSize() == 0)
		                {
		                    System.out.println("Não há ninguém cadastrado até o momento.");
		                    break;
		                }
		                else
		                {
		                    myTurma.imprimeAlunos();
		                    break;
		                }
		            }
		        case 3:
		            {
		                if(myTurma.getSize() == 0)
		                {
		                    System.out.println("Não há ninguém cadastrado até o momento.");
		                    break;
		                }
		                else
		                {
		                    myTurma.imprimeResponsaveis();
		                    break;
		                }
		            }
		        case 4:
		            {
		                if(myTurma.getSize() >= 10)
		                {
		                    System.out.println("Turma cheia!");
		                    break;
		                }
		                System.out.println("Insira o nome do aluno: ");
		                String nome = sc.next();
		                while(!EntradaDados.VerificaEntradaString(nome))
		                {
		                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                    System.out.println("Nome inválido. Digite-o novamente:");
		                    sc.nextLine();
		                    nome = sc.next();
		                }
		                sc.nextLine();
		                
		                System.out.println("Insira a matricula do aluno: ");
		                String matricula = sc.next();
		                while(!EntradaDados.VerificaMatricula(matricula))
		                {
		                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                    System.out.println("Matricula inválida. Digite-o novamente, lembrando que a mesma deve possuir 5 digitos:");
		                    sc.nextLine();
		                    matricula = sc.next();
		                }
		                sc.nextLine();
		                
		                System.out.println("Insira o email do aluno: ");
		                String email = sc.next();
		                while(!EntradaDados.VerificaEmail(email))
		                {
		                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                    System.out.println("Email inválido. Digite-o novamente:");
		                    sc.nextLine();
		                    email = sc.next();
		                }
		                sc.nextLine();
		                
		                System.out.println("Insira o telefone do aluno no formato XXXXXXXXXXX (11 digitos):");
		                String telefone = sc.next();
		                while(!EntradaDados.VerificaTelefone(telefone))
		                {
		                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                    System.out.println("Telefone inválido. Digite-o novamente:");
		                    sc.nextLine();
		                    telefone = sc.next();
		                }
		                sc.nextLine();
		                
		                System.out.println("Insira o nome do responsavel: ");
		                String resnome = sc.next();
		                while(!EntradaDados.VerificaEntradaString(resnome))
		                {
		                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                    System.out.println("Nome inválido. Digite-o novamente:");
		                    sc.nextLine();
		                    resnome = sc.next();
		                }
		                sc.nextLine();
		                
		                System.out.println("Insira o email do responsavel: ");
		                String resemail = sc.next();
		                while(!EntradaDados.VerificaEmail(resemail))
		                {
		                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                    System.out.println("Email inválido. Digite-o novamente:");
		                    sc.nextLine();
		                    resemail = sc.next();
		                }
		                sc.nextLine();
		                
		                System.out.println("Insira o telefone do responsavel no formato XXXXXXXXXXX (11 digitos):");
		                String restelefone = sc.next();
		                while(!EntradaDados.VerificaTelefone(restelefone))
		                {
		                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                    System.out.println("Telefone inválido. Digite-o novamente:");
		                    sc.nextLine();
		                    restelefone = sc.next();
		                }
		                sc.nextLine();
		                
		                myTurma.addAluno(new Aluno(nome, email, telefone, matricula, new Responsavel(resnome, resemail, restelefone)));
		            }
		            break;
		        case 5:
		            return;
		        default:
		            {
		                System.out.println("\n Opção invalida\n");
		            }
		    }
		}
	}
}
