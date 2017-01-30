
package aula_9;

public class Professor extends Pessoa
{
//    private String nome;
//    private int idade;
//    private String sexo;
    private String especialidae;
    private float salario;
    
//    public void fazerAniversario()
//    {
//        
//    }
    
    public void receberAumento(float aumento)
    {
        this.salario = salario + aumento;
    }

    public String getEspecialidae() {
        return especialidae;
    }

    public void setEspecialidae(String especialidae) {
        this.especialidae = especialidae;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
