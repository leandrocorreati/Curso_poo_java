
package aula_12;

public class Aula_12 
{

    public static void main(String[] args)
    {
        // Animal n = new Animal(); /// Como a classe <Animal.java> é abstrata ela não pode ser instanciada( não podem ser criados objetos a partir dela)
        
        // OBJETOS INSTANCIADOS
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        /*
        POLI = MUITAS 
        MORFO = FORMAS
        
        1- POLIMORFISMO DE SOBREPOSIÇÃO:
        ACONTECE QUANDO SUBSTITUIMOS UM METODO DE UMA SUPERCLASSE NA SUA SUBCLASSE, USANDO A MESMA ASSINATURA.
        
        
        O CONCEITO DE POLIMORFISMO SE DÁ PELA CHAMADA DE METÓDOS IGUAIS EM OBJETOS INSTANCIADOS DIFERENTES, E MESMO SENDO IGUAIS, OS METODOS 
        TEM RESPOSTAS DIFERENTES CONFORME O OBJETO QUE O CHAMOU.
        
        * OBS: ASSINATURA DE UM MÉTODO É A QUANTIDADE E TIPO DE PARAMETROS QUE ELE RECEBE.
        */
        
        // METÓDOS IGUAIS, MAS COM RESPOSTAS DIFERENTES.
        
        System.out.println("========================RESOSTA DO OBJETO m ======================");
        m.setPeso(85.3f);
        m.setIdade(29);
        m.setMembros(5);
        m.locomover(); // correndo
        m.alimentar(); // mamando
        m.emitirSom(); // som de mamifero
        
        System.out.println("========================RESOSTA DO OBJETO p ======================");
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover(); // nadando
        p.alimentar(); // comendo planctons
        p.emitirSom(); // peixes não emitem som
        p.soltarBolha(); // soltou bolha
        
        
        System.out.println("========================RESOSTA DO OBJETO a ======================");
        a.setPeso(0.85f);
        a.setIdade(3);
        a.setMembros(4);
        a.locomover(); // voando
        a.alimentar(); // comendo sementes
        a.emitirSom(); // cantando
        a.fazerNinho(); //fazendo ninho
        
        Canguru guru = new Canguru();
        Cachorro dog = new Cachorro();
        Arara blue = new Arara();
        
        System.out.println("========================RESOSTA DO OBJETO guru / CLASSE: Canguru.java ======================");
        guru.setPeso(55.33f);
        guru.setMembros(4);
        guru.setIdade(5);
        guru.setCorPelo("Marrom");
        guru.locomover();
        guru.alimentar();
        guru.emitirSom();
        guru.usarBolsa();
        
        System.out.println("========================RESOSTA DO OBJETO dog / CLASSE: Cachorro.java ======================");
        dog.setPeso(10f);
        dog.setIdade(6);
        dog.setMembros(4);
        dog.setCorPelo("preto");
        dog.locomover();
        dog.abanarRabo();
        dog.emitirSom();
        dog.enterrarOsso();
        dog.alimentar();
        
        
        System.out.println("==========================================================================================");
        blue.setCorPena("azul");
        System.out.println(" A cor da arara é " + blue.getCorPena());
        
        
        
    }
    
}
