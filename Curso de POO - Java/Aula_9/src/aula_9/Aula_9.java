
package aula_9;

public class Aula_9 
{

    public static void main(String[] args) 
    {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Leandro");
        System.out.println("O nome do aluno é " + p1.getNome());
        
        p2.setNome("Larissa");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Ciencia da Computação");
        System.out.println("A aluna " + p2.getNome() + " cursa " + p2.getCurso());
        
        p3.setSalario(2500.90f);
        p4.setSetor("Atendimento");
        
       // p4.setSalario(454f);
       // p2.mudarTrabalho()
          
        
    }
    
}
