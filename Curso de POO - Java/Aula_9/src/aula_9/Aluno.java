
package aula_9;

public class Aluno extends Pessoa // O extends é usado para criar a herança. Nesse caso a classe "Aluno" herda da classe "Pessoa"
{
//     Atributos
//    private String nome;
//    private int idade;
//    private String sexo;
    private int matricula;
    private String curso;
    
    // Metódos personalizados
//     public void fazerAniversario()
//     {
//         
//     }
    
     public void cancelaMatricula()
     {
         System.out.println("Cancelar Matricula");
         
     }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
     
     
}
