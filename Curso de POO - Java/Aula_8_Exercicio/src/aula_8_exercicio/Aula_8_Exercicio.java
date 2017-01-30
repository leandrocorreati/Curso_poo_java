
package aula_8_exercicio;

public class Aula_8_Exercicio {

    public static void main(String[] args) 
    {
        Pessoa[] p1 = new Pessoa[2];
        Livro [] l = new Livro[2];
        p1[0] = new Pessoa("Leandro" , 29 , "masculino");
        p1[1] = new Pessoa("Larissa" , 32 , "Feminino");
        
        l[0] = new Livro("Dom quixote", "desconhecido", 299, 20,false,p1[0] );//String titulo, String autor, int totPaginas, int paginaAtual, boolean aberto, Pessoa leitor)
        l[1] = new Livro("o apanhador no campo de centeio", "desconhecido", 299, 20,false,p1[1] );
        
        System.out.println(l[0].detalhes());
    }
    
}
