
package aula3;

public class Caneta3 
{
    private String modelo; //ATRIBUTOS (OBS: os atributos devem ser todos private!!!)
    private float ponta; //ATRIBUTOS
    private boolean tampada; //ATRIBUTOS
    private String cor;
    
    
    public Caneta3() //Metódos construtores são identificados por terem o mesmo nome da classe. Exemplo: Caneta3 igual Caneta3()
    {
        this.tampar();      // Metódos contrutores tem a finalidade de definir caracteristicas(conteúdo),
        this.cor = "azul"; //  para os atributos atrvés da chamada de outro metódos ou através de atribuições diretas.
    }
    
    public String getModelo() // Metódo get para obtenção do valor do atributo
    {
        return this.modelo;  // retorna o valor do atributo 
    }
    
    public void setModelo(String m) // Metódo set para inserir um valor ao atributo
    {
        this.modelo = m; // O "this" faz referencia ao objeto que foi instanciado na classe main(principal). 
                        // A manipulação do atributo da classe se dá pela criação da variável "m" , 
                       // o atributo recebe o que for colocado em "m", sendo assim se manipula o atributo indiretamente.
    }
    
    public float getPonta()
    {
        
        return this.ponta;
    }
    
    public void setPonta(float p) // Descrição: setPonta(float p) = setPonta(4.5f), que por sua vez passa para this.ponta
    {
        this.ponta = p;
    }
    
    public void tampar()
    {
        this.tampada = true;
    }
            
    public void destampar()
    {
       this.tampada = false;
    }
    
    public void status()
    {
        System.out.println("SOBRE O MODELO: ");
        System.out.println("O Modelo é " + this.modelo);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("A cor da Caneta é "+ this.cor);
    }
}
