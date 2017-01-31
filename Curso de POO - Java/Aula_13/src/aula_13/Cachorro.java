
package aula_13;

public class Cachorro extends Lobo
{
    // ATRIBUTOS
    private String raca;

    // METODOS ACESSORES DO ATRIBUTO
    public String getRaca()
    {
        return raca;
    }

    public void setRaca(String raca) 
    {
        this.raca = raca;
    }
    
    // METODOS SOBREPOSTOS (SOBRESCRITOS)
    @Override
    public void emitirSom()
    {
        System.out.println("Latindo, auauauauauauau!!!");
    }
    
    @Override
    public void alimentar()
    {
        System.out.println("Comendo ração Pedigree da tigela");
    }
    
    /// " POLIMORFISMO DE SOBRECARGA " 
    /* EXEMPLO DE METODO DE SOBRECARGA, NO QUAL SE ALTERA A ASSINATURA DO METODO(O QUE ELE RECEBE DE  PARAMETRO). PODENDO ASSIM DEFINIR RESPOSTAS DIFERENTES 
        E USANDO O MESMO METODO VARIAS VEZES NA MESMA CLASSE*/
    public void reagir(String frase)
    {
        if(frase == "Hora da comida" || frase == "Bom garoto")
        {
            System.out.println("Abanar o rabo e latir muito de felicidade");
        }
        else 
            System.out.println("Rosnar");
    }
    public void reagir(int hora , int min)
    {
        if (hora <12 )
        {
            System.out.println("Abanar o rabo");
        }
        else if(hora >= 18)
        {
            System.out.println("Ignorar o dono");
        }
        else
            System.out.println("Latir");
    }
    public void reagir(boolean dono)
    {
        if (dono == true)
        {
            System.out.println("Pulando");
        }
        else
            System.out.println("Latindo alto e sem parar");
    }
    public void reagir(int idade, float peso)
    {
        if (idade < 5 )
        {
            if (peso <10)
            {
                System.out.println("Pula e abana o rabo");
            }
            else
                System.out.println("lati");
        }else
        {
           if(peso >10)
           {
               System.out.println("Rosnar");
           }else 
               System.out.println("ignorar");
        }
    }
    
    
}
