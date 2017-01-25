
package aula7;

public class Lutador 
{
    // ATRIBUTOS
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // METÓDO CONSTRUTOR
    
    public Lutador(String no, String na, int id, float al, float pe,int vi,int de,int em)
    {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    
    
    
    //METÓDOS PERSONALIDADOS
    
    public void apresentar()
    {
        System.out.println("============================================================================");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Com o cartel de " + getVitorias() + " vitorias, " + getEmpates() + " empates e " + getDerrotas() + " derrotas");
    }
    public void status()
    {
        
    }
    public void ganharLuta()
    {
        setVitorias(getVitorias()+1);
        
    }
    public void perderLuta()
    {
        setDerrotas(getDerrotas() + 1);
        
    }
    public void empatarLuta()
    {
        setEmpates(getEmpates() + 1);
    }
    
    // METÓDOS GETTERS E SETTERS

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    private String getNacionalidade() 
    {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) 
    {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() 
    {
        return idade;
    }

    private void setIdade(int idade) 
    {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) 
    {
        this.altura = altura;
    }

    private float getPeso()
    {
        return peso;
    }

   private void setPeso(float peso) 
    {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria() 
    {
        if (getPeso() < 52.0 )
        {
            this.categoria  = "invalido";
        }
        if (getPeso() <= 70.3)
        {
            this.categoria = "leve";
        }
        else if (getPeso() <= 83.9)
        {
            this.categoria = "Médio";
        }
        else if (getPeso() <= 120.0)
        {
            this.categoria = "pesado";
        }
        
    }

    private int getVitorias() 
    {
        return vitorias;
    }

    private void setVitorias(int vitorias) 
    {
        this.vitorias = vitorias;
    }

    private int getDerrotas()
    {
        return derrotas;
    }

    private void setDerrotas(int derrotas)
    {
        this.derrotas = derrotas;
    }

    private int getEmpates()
    {
        return empates;
    }

    private void setEmpates(int empates)
    {
        this.empates = empates;
    }
    
    
    
}
