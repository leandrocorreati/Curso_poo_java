package aula_10;
public class Aula_10 {

    public static void main(String[] args)
    {/*
        * Arvoré de Herança 
        
       // * Classe Abstrata: Não pode ser instanciada. Só pode servir como progenitora.
        
       // * Metódo Abstrato:  Declarado, mas não implementado na progenitora.
        
       // * Classe Final: Não pode ser herdada por outra classe. Obrigatoriamente "folha"
        
       // * Metódo Final: Não pode ser sobrescrito pelas suas sub-classes. Obrigatoriamenteherdado.
        */
        
        //Pessoa p1 = new Pessoa();  //Ao se tentar criar um objeto da classe Pessoa, surge um erro devido a classe pessoa estar com sua visibilidade como abstract
        Visitante v1 = new Visitante ();
        v1.setNome("Leandro");
        v1.setIdade(29);
        v1.setSexo("Masculino");
        //System.out.println(v1.getIdade());
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Leandro");
        a1.setMatricula(14006732);
        a1.setCurso("Ciencia da Computação");
        a1.setIdade(29);
        a1.setSexo("masculino");
        a1.PagarMensalidade();
           
           System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Daniel");
        b1.setMatricula(14006688);
        b1.setBolsa(12.6f);
        b1.setSexo("masculino");
        System.out.println(b1.toString());
        b1.PagarMensalidade();
    }
    
}
