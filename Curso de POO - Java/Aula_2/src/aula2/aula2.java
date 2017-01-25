
package aula2;

public class aula2 
{
    public static void main(String[] args) 
    {
        Caneta2 c1 = new Caneta2();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
                
    }
}
