
package aula_10;

public class Bolsista extends Aluno
{
    private float bolsa;
    
    
     public void renovarBolsa()
     {
         System.out.println("Renovando a Bolsa do aluno " + this.getNome());
     }
     
    @Override
     public void PagarMensalidade()
    {
        System.out.println(this.getNome() + " é bolsista o pagamento é diferenciado ");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
     
     
}
