package L2_01;

public class Turma
{
    private Aluno[] myTurma = new Aluno[10];
    private int numAlunos;
    
    //BUILDER
    public Turma(Aluno[] myTurma, int numAlunos)
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
    
    public Turma() 
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
    
    //adiciona um novo aluno
    //a verificação se ultrapassa o limite
    //foi feito na main
    //mas poderia ter sido implementado aqui
    //sem maiores complicações
    public void addAluno(Aluno novoAluno)
    {
        this.myTurma[this.numAlunos] = novoAluno;
        this.numAlunos++;
    }


    //mostra a turma na tela com todas as informações
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
    
    //mostra apenas os alunos 
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
    
    //mostra os responsaveis e o nome do aluno que estão relacionados
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