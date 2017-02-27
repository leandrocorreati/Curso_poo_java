
package exercicioparadigma;

import static java.awt.PageAttributes.MediaType.A;
import javax.swing.JOptionPane;

public class ExercicioParadigma {

    public static void main(String[] args) 
    {
        Perimetro p = new Perimetro();
        Perimetro a = new Perimetro();
        System.out.println(p.calcPerimetro(5, 6, 8));
   
        
        float base, altura, area;
        String entrada, saida;
        entrada = JOptionPane.showInputDialog("Informe o valor da base");
        base=Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Informe o Valor da Altura");
        altura=Integer.parseInt(entrada);
        JOptionPane.showMessageDialog(null, "A área do triangulo é " + a.calcArea(base, altura));
        
   
    }
    
}
