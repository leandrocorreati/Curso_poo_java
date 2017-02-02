package aula_14;
public class Video implements AcoesVideo
{
    // ATRIBUTOS
    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;

    // METODOS ACESSORES
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    private boolean reproduzindo;
    

    // METODOS DA INTERFACE A SEREM IMPLEMENTADOS
    @Override
    public void play() 
    {
    }

    @Override
    public void pause() 
    {
    }

    @Override
    public void like() 
    {
    }
    
}