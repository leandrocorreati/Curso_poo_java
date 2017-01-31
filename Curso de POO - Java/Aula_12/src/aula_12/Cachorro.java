
package aula_12;

public class Cachorro extends Mamifero
{
    public void enterrarOsso()
    {
        System.out.println("Enterrando ossos");
    }
    
    public void abanarRabo()
    {
        System.out.println("abana o rabo quando está feliz ");
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Latindo, AU AU AU ");
    }
    
    @Override
    public void alimentar()
    {
        System.out.println("Comendo ração pedigree");
    }
    
    
}
