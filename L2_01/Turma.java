package L2_01;
import java.util.*;
import java.io.*;

class Turma
{
    private Aluno[] myTurma = new Aluno[10];
    private int numAlunos;
    
    //BUILDER
    Turma(Aluno[] myTurma, int numAlunos)
    {
        for(int i = 0; i < numAlunos; i++)
        {
            this.myTurma[i] = myTurma[i];
        }
        for(int i = numAlunos; i < 10; i++)
        {
            this.myTurma[i] = null;
        }
        
        this.numAlunos = numAlunos;
    }
    
    Turma() 
    {
        for(int i = 0; i < 10; i++)
        {
            this.myTurma[i] = null;
        }
        this.numAlunos = 0;
    }
    
    //METODOS
    public Aluno[] getTurma()
    {
        Aluno[] myTurma = new Aluno[this.numAlunos];
        for(int i = 0; i < this.numAlunos; i++)
        {
            myTurma[i] = this.myTurma[i];
        }
        return myTurma;
    }
    
    public int getSize()
    {
        return this.numAlunos;
    }
    
    public void addAluno(Aluno novoAluno)
    {
        this.myTurma[this.numAlunos] = novoAluno;
        this.numAlunos++;
    }
    
    public void imprimeTurma()
    {
        System.out.println("Informações da turma\n");
        System.out.println("###############################################");
        for(int i = 0; i < this.numAlunos; i++)
        {
            System.out.println("Dados do aluno:\n");
            System.out.println("Nome: " + myTurma[i].getNome());
            System.out.println("Matricula: " + myTurma[i].getMatricula());
            System.out.println("Email: " + myTurma[i].getEmail());
            System.out.println("Telefone: " + myTurma[i].getTelefone());
            System.out.println("Dados do responsavel:\n");
            System.out.println("Nome: " + myTurma[i].getResponsavel().getNome());
            System.out.println("Email: " + myTurma[i].getResponsavel().getEmail());
            System.out.println("Telefone: " + myTurma[i].getResponsavel().getTelefone());
            System.out.println("###############################################");
        }
    }
    
    public void imprimeAlunos()
    {
        System.out.println("Informações da turma\n");
        System.out.println("###############################################");
        for(int i = 0; i < this.numAlunos; i++)
        {
            System.out.println("Dados do aluno:\n");
            System.out.println("Nome: " + myTurma[i].getNome());
            System.out.println("Matricula: " + myTurma[i].getMatricula());
            System.out.println("Email: " + myTurma[i].getEmail());
            System.out.println("Telefone: " + myTurma[i].getTelefone());
            System.out.println("###############################################");
        }
    }
    
    public void imprimeResponsaveis()
    {
        System.out.println("Informações da turma\n");
        System.out.println("###############################################");
        for(int i = 0; i < this.numAlunos; i++)
        {
            System.out.println("Dados do responsavel:\n");
            System.out.println("Nome do aluno: " + myTurma[i].getNome());
            System.out.println("Nome do responsavel: " + myTurma[i].getResponsavel().getNome());
            System.out.println("Email: " + myTurma[i].getResponsavel().getEmail());
            System.out.println("Telefone: " + myTurma[i].getResponsavel().getTelefone());
            System.out.println("###############################################");
        }
    }
}
