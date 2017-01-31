package aula_12;

public class Peixe extends Animal
{
    //ATRIBUTOS
    private String corEscama;
    
    // METÓDO PERSONALIZADO
    public void soltarBolha()
    {
        System.out.println("Soltou bolha");
    }

    // METÓDOS SOBREPOSTOS DA CLASSE 'ANIMAL'
    @Override
    public void locomover() 
    {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() 
    {
        System.out.println("comendo planctons");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("peixes não emitem som");
    }
    
    // METÓDOS ACESSORES
     public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
