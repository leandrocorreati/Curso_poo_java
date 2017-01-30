
package aula_8_exercicio;
public class Pessoa 
{
    // atributos
    private String nome;
    private int idade;
    private String sexo;

    //metódo construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    //metódos personalizados
    public void fazerAniversario()
    {
        this.setIdade(getIdade() + 1);
    }

    // Metódos acessores
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }
    
    
}
