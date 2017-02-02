package aula_14;
public class Video implements AcoesVideo // USO DA INTERFACE E IMPLEMENTAÇÃO DOS SEUS METODOS 
{
    // ATRIBUTOS
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // CONSTRUTOR
    public Video(String titulo) 
    {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    // METODOS ACESSORES
    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao)
    {
        int nova = ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = avaliacao;
    }

    public int getViews() 
    {
        return views;
    }

    public void setViews(int views)
    {
        this.views = views;
    }

    public int getCurtidas() 
    {
        return curtidas;
    }

    public void setCurtidas(int curtidas)
    {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo()
    {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo)
    {
        this.reproduzindo = reproduzindo;
    }
  
    

    // METODOS DA INTERFACE A SEREM IMPLEMENTADOS
    @Override
    public void play() 
    {
        this.reproduzindo = true;
    }

    @Override
    public void pause() 
    {
        this.reproduzindo = false;
    }

    @Override
    public void like() 
    {
        this.curtidas++;
    }

    // METODO PARA MOSTRAR OS ATRIBUTOS
    @Override
    public String toString()
    {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
