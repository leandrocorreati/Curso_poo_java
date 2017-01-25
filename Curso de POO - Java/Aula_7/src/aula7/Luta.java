package aula7;

public class Luta
{
     private Lutador desafiante;  // O tipo colocado é abstrato  - significa que a instancia da classe Lutador (o valor atribuido aos atributos de "Lutador" quando ela é instanciada(criado um objeto) na class                                                    e principal(main)é que  dá o tipo ao atributo na classe "Luta". ISSO SE CHAMA AGREGAÇÃO !!!!
     private Lutador desafiado;
     private int rounds;
     private boolean aprovada ;

     
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
