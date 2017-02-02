package aula_14;
public class Visualizacao
{
    // ATRIBUTOS
    private Aluno espectador; // 1° AGREGAÇÃO: OS ATRIBUTOS DA CLASSE VISUALIZACAO RECEBEM COMO TIPO AS CLASSES ALUNO E VIDEO, 
    private Video filme;

    // METODO CONSTRUTOR
    public Visualizacao(Aluno espectador, Video filme)
    {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1); // 2º AGREGAÇÃO: Para alterar o atributo (totalAssitido)  da classe Aluno, 
        this.filme.setViews(this.filme.getViews() + 1);                                                // o atributo espectador da classe Visualizacao recebe no metodo construtor 'this.espectador.getTotalAssistido() + 1' que 
                                                                                                                             // significa que fiz uma referencia a outra classe pelo atributo desta que recebe ela como tipo.*/
    }
    
    //  // METODO PERSONALIZADO COM SOBRECARGA
    public void avaliar()
    {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota)
    {
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc)
    {
        
    }
     
    
    // METODOS ACESSORES
    public Aluno getEspectador()
    {
        return espectador;
    }

    public void setEspectador(Aluno espectador) 
    {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) 
    {
        this.filme = filme;
    }
    
    
    
    // METODO PARA MOSTRAR OS ATRIBUTOS 
    @Override
    public String toString()
    {
        return " " + "Espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
