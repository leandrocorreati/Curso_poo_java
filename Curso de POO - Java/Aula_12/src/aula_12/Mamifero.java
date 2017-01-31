
package aula_12;

public class Mamifero extends Animal
{
    // ATRIBUTOS
    private String corPelo;

    // METÓDOS ACESSORES
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    // METÓDOS SOBREPOSTOS DA CLASSE 'ANIMAL'
    @Override
    public void locomover() 
    {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar()
    {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de mamifero");
    }
}
