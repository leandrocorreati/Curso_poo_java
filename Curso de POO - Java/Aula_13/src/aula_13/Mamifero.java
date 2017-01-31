
package aula_13;

public class Mamifero extends Animal
{
    @Override
    public void reagir() 
    {
        System.out.println("Não se aplica");
    }

    @Override
    public void alimentar() 
    {
        System.out.println("Alimentação padrão");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de mamifero");
    }
}
