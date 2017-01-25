
package aula2;

public class Caneta2 
{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private Boolean tampada;
    
    public void status()
    {
        /*
        String estado = tampada.toString() ;
        if ("true".equals(estado))
        {
            estado = "Sim";
            System.out.println("Está tampada: " + estado);
        }
        else
        {
            estado = "Não";
            System.out.println("Está tampada: " + estado);
        }
        */
        
        System.out.println("Está tampada: " + this.tampada);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Carga " + this.carga);
    }
    
    public void rabiscar()
    {
        if (tampada == true)
        {
            System.out.println("ERRO! Não posso escrever estou tampada !");
        }
        else
        {
            System.out.println(" Estou Rabiscando !");
        }
    }
    
    public void tampar()
    {
        this.tampada = true;
    }
    
    public void destampar()
    {
        this.tampada = false;      
    }
    
    
    
}
