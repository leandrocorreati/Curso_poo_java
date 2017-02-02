package aula_14;
public class Aluno extends Pessoa
{
    //ATRIBUTOS
    private String login;
    private int totalAssistido;

    // METODO CONSTRUTOR
    public Aluno(String nome, int idade, String sexo, String experiencia, String login) 
            /* COMO A CLASSE MÃE QUE É <PESSOA> TEM UM METODO CONSTRUTOR, TODAS AS CLASSES FILHAS TERAM QUE POSSUIR UM METODO CONSTRUTOR 
            PARA INICIALIZAR OS ATRIBUTOS HERDADOS*/
    {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totalAssistido = 0 ;
    }
    
    // METODO PERSONALIZADO
    public void viuMaisUm()
    {
        
    }

    //METODOS ACESSORES
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString()  // polimorfismo de sobreposição
    {
        return "" + super.toString()+"\nlogin=" + login + ", toAssistindo=" + totalAssistido + '}'; /// para chamar o metodo <toString()> da classe <Pessoa>, e obter uma resposa em conjunto com o metodo
        // <toString()> da classe Aluno foi usado a palavra <super.metodo()>
        // O super faz referencia a classe anterior, a classe ascendente.
    }
    
    
}
