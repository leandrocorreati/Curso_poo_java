package aula_12;
public class Reptil extends Animal
{
    // ATRIBUTOS
    private String corEscama;

    // METÓDOS SOBREPOSTOS DA CLASSE 'ANIMAL'
    @Override
    public void locomover()
    {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar()
    {
        System.out.println("comendo vegetais");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("som de reptil");
    }

    
    // METÓDOS ACESSORES
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
