
package aula7;

public class aula7 
{
    public static void main(String[] args)
    {
        Lutador l[ ] = new Lutador[6];
        l[0] = new Lutador("Leandro", "Brasil",29,1.86f, 81.8f,11,2,1);
        l[1] = new Lutador("Wanderley Silva", "Brasil",40,1.86f, 81.8f,11,2,1);
        l[2] = new Lutador("Leandro", "Brasil",29,1.56f, 85.8f,11,2,1);
        l[3] = new Lutador("Leandro", "Brasil",29,1.56f, 85.8f,11,2,1);
        l[4] = new Lutador("Leandro", "Brasil",29,1.56f, 85.8f,11,2,1);
        l[5] = new Lutador("Leandro", "Brasil",29,1.56f, 85.8f,11,2,1);
        
//        for(int i = 0  ; i <= 5; i++)
//        {
//            l[i].apresentar();
//        }
        
       Luta ufc = new Luta();
       
       ufc.marcarLuta(l[0], l[1]);
       ufc.lutar();
       
    }
   
    
    
    
}
