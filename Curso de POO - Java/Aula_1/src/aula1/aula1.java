
package aula1;

public class aula1 
{
    public static void main(String[] args) 
    {
        Caneta1 c1 = new Caneta1();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        // String t = c1.tampada.toString();
        
        System.out.println("========================================");
        
        Caneta1 c2 = new Caneta1();
        c2.cor = "preta";
        c2.ponta = 1.0f;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
