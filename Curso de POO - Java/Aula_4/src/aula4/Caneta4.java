
package aula4;



public class Caneta4 
{
    private String modelo;   //ATRIBUTOS (OBS: os atributos devem ser todos private!!!)
    private float ponta;     //ATRIBUTOS
    private boolean tampada; //ATRIBUTOS
    private String cor;      //ATRIBUTOS

    // Construtor
    public Caneta4(String modelo, float ponta, boolean tampada, String cor) // Para gerar automaticamente o metódo construtor digite 
                                                                            // Ctrl + space, e a IDE irá sugerir o construtor.
    {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }
    
        
//    public Caneta4(String m, String c, float p) //Metódos construtores são identificados por terem o mesmo nome da classe. 
//                                                //Exemplo: Caneta3 igual a Caneta3()
//    {
//        this.ponta = p;
//        this.modelo = m;
//        this.tampar();      // Metódos contrutores tem a finalidade de definir caracteristicas(conteúdo),
//        this.cor = c; //  para os atributos atrvés da chamada de outro metódos ou através de atribuições diretas.
//    }
//    
//    public String getModelo() // Metódo get para obtenção do valor do atributo
//    {
//        return this.modelo;  // retorna o valor do atributo 
//    }
//    
//    public void setModelo(String m) // Metódo set para inserir um valor ao atributo
//    {
//        this.modelo = m; // O "this" faz referencia ao objeto que foi instanciado na classe main(principal). 
//                        // A manipulação do atributo da classe se dá pela criação da variável "m" , 
//                       // o atributo recebe o que for colocado em "m", sendo assim se manipula o atributo indiretamente.
//    }
//    
//    public float getPonta()
//    {
//        
//        return this.ponta;
//    }
//    
//    public void setPonta(float p) // Descrição: setPonta(float p) = setPonta(4.5f), que por sua vez passa para this.ponta
//    {
//        this.ponta = p;
//    }
//    
//    public void tampar()
//    {
//        this.tampada = true;
//    }
//            
//    public void destampar()
//    {
//       this.tampada = false;
//    }
//    
    public void status()
    {
        System.out.println("SOBRE O MODELO: ");
        System.out.println("O Modelo é " + this.modelo);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("A cor da Caneta é "+ this.cor);
        System.out.println("Ela está tampada: " + this.tampada);
    }

    
    public String getModelo() {
        return modelo;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public float getPonta() {
        return ponta;
    }

    
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    
    public boolean isTampada() {
        return tampada;
    }

    
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    
    public String getCor() {
        return cor;
    }

   
    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
