package aula_14;
public abstract class Pessoa // CLASSE ABSTRATA QUE NÃO PODE SER INSTANCIADA
{
    // ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    private String experiencia;

    // METODO CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo, String experiencia)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }

    // METODOS ACESSORES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
    // METODOS PERSONALIZADOS
    public void ganharExp()
    {
        
    }

    // METODO PARA MOSTRAR OS ATRIBUTOS 
    @Override
    public String toString() {
        return "" + "" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
    
}
