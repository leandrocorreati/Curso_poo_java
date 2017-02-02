package aula_14;
public class Aula_14 {
    public static void main(String[] args)
    {
        Video v[] = new Video [3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video ("Aula de Mysql");
        v[2]= new Video ("Aula de Word");
        
        Aluno a[] = new Aluno[3];
        a[0] = new Aluno("Leandro" , 29 , "Masculino" , "positiva" , "leandrocorreati@gmail.com");
        a[1] = new Aluno("Larissa" , 32 , "Feminino" , "negativa" , "larissa_p@gmail.com");
        a[2] = new Aluno("Leonardo" , 9 , "Masculino" , "positiva" , "leo_pedroso@gamil.com");    
                
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println(v[i].informacoes());
        }
        
        System.out.println("================================================");
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println(a[i].toString());
        }
    }
    
}
