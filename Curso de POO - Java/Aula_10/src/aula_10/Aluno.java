
package aula_10;

public /* final */class Aluno extends Pessoa ///Para que uma classe  não gere herança para outras ( os metódos e atributos não ficarem acessiveis )  podesse utilizar a palavra 'final' em sua sintaxe
{
    private int matricula;
    private String curso;
    
    public /* final */ void PagarMensalidade() // para que um metódo não seja sobrescrito (@Override) podesse utilizar a palavra 'final' em sua sintaxe
    {
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
        
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getCurso() 
    {
        return curso;
    }

    public void setCurso(String curso) 
    {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + '}';
    }
    
    
}
