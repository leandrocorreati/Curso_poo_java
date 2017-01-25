package aula7;

import java.util.Random;

public class Luta
{
    //ATRIBUTOS 
    
     private Lutador desafiante;  // O tipo colocado é abstrato  - significa que a instancia da classe Lutador (o valor atribuido aos atributos de "Lutador" quando ela é instanciada(criado um objeto)
                                                                                              //  na classe principal(main) é que  dão o tipo ao atributo na classe "Luta". ISSO SE CHAMA AGREGAÇÃO !!!!
     private Lutador desafiado;
     private int rounds;
     private boolean aprovada ;
     
     //METÓDOS PERSONALIZADOS
     
     public void marcarLuta(Lutador l1,Lutador l2)
     {
         if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)
         {
             aprovada = true;
             desafiado = l1;
             desafiante = l2;
         }
         else
         {
             aprovada = false;
             desafiado = null;
             desafiante = null;
         }
         
     }
     public void lutar()
     {
         if (this.aprovada)
         {
             this.desafiado.apresentar();
             this.desafiante.apresentar();
             System.out.println("=======================================================================================================");
             Random gerador = new Random();
             int vencedor = gerador.nextInt(3);
                     switch(vencedor)
                     {
                         case 0 : System.out.println("Empatou");
                         desafiado.empatarLuta();
                         desafiante.perderLuta();
                         break;
                         
                         case 1: System.out.println(" Vitoria de " + this.desafiado.getNome());
                         desafiado.ganharLuta();
                         desafiante.perderLuta();
                         break;
                         
                         case 2 : System.out.println(" Vitoria de" +  this.desafiado.getNome());
                         desafiado.ganharLuta();
                         desafiante.perderLuta();
                         break;
                     }
         }
         else
         {
             System.out.println("Luta não pode acontecer !!!!");
         }
         
     }

     
     // METÓDOS ACESSORES ( GETTERS E SETTERS )
     
    private Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
