
package aula_12;

public class Ave extends Animal
{
    // ATRIBUTOS
    private String corPena;
    
    // METÓDOS PERSONALIZADOS
    public void fazerNinho()
    {
        System.out.println("Fazendo ninho");
    }

    // METÓDOS SOBREPOSTOS DA CLASSE 'Animal.java'
    @Override
    public void locomover() 
    {
        System.out.println("voando");
    }

    @Override
    public void alimentar() 
    {
        System.out.println("comento sementes");
    }
    
     @Override
    public void emitirSom() 
    {
        System.out.println("cantando");
    }
    
    // METÓDOS ACESSORES

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

   
}
