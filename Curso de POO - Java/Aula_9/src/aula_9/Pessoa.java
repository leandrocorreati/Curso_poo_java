
package aula_9;

public class Pessoa
{
    private String nome;
    private int idade;
    private String sexo;
    
    
    //METÓDO PERSONALIZADO
    public void fazerAniversario()
    {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    //METÓDOS ACESSORES
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdae() {
        return idade;
    }

    public void setIdae(int idae) {
        this.idade = idae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
