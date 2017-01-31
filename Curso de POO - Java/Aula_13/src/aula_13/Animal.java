
package aula_13;
public abstract class Animal 
{
    //  ATRIBUTOS
    private float peso;
    private int idade ;
    private int membros;
    
    // METODOS ABSTRATOS A SEREM COMPLEMENTADOS NAS CLASSE QUE HERDAREM DA  CLASSE ANIMAL
    public abstract void reagir();
    public abstract void alimentar();
    public abstract void emitirSom();

    // METODOS ACESSORES
    public float getPeso() 
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public int getMembros()
    {
        return membros;
    }

    public void setMembros(int membros) 
    {
        this.membros = membros;
    }
    
}
