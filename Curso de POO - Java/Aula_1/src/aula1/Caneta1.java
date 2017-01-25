
package aula1;


public class Caneta1 
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    Boolean tampada;
    
    void status()
    {
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
        
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Carga " + this.carga);
    }
    
    void rabiscar()
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
    
    void tampar()
    {
        
        this.tampada = true;
    }
    
    void destampar()
    {
        this.tampada = false;      
    }
    
    
    
}
