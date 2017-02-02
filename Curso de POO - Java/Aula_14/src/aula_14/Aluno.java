package aula_14;
public class Aluno extends Pessoa
{
    private String login;
    private boolean toAssistindo;
    
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

    public boolean isToAssistindo() {
        return toAssistindo;
    }

    public void setToAssistindo(boolean toAssistindo) {
        this.toAssistindo = toAssistindo;
    }
    
}
