
package aula_13;

public class Lobo extends Mamifero
{
     // METODOS SOBREPOSTOS (SOBRESCRITOS)
    @Override
    public void reagir()
    {
        System.out.println("Feroz não se aproxime animal selvagem");
    }
    @Override
    public void alimentar()
    {
        System.out.println("Vai caçar em alcateia");
        
    }
    @Override
    public void emitirSom()
    {
        System.out.println(" Uivar, auuuuuuuuuuuuuuuuuuuu!!!!!");
    }
}
