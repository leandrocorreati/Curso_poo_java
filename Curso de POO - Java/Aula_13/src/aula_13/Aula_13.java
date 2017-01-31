

package aula_13;

public class Aula_13 {

    public static void main(String[] args) 
    {
        // EXEMPLO DE CHAMADA DE METODO COM SOBRECARGA DE ASSINATURA. CONFORME A ASSINATURA  MUDA A RESPOSTA OBTIDA É DIFERENTE.
        Cachorro dog = new Cachorro();
        Lobo wolf = new Lobo();
        System.out.println("=================== Lobo ==================");
        wolf.emitirSom();
        System.out.println("============== Cachorro ====================");
        dog.emitirSom();
        dog.reagir("Hora da comida");
        dog.reagir(false);
        dog.reagir(6, 2);
        
        
        // REVISÃO:
        // 1- POLIMORFISMO DE SOBREPOSIÇÃO - MESMA ASSINATURA CLASSES DIFERENTES 
        // 2- POLIMORFISMO DE SOBRECARGA - ASSINATURAS DIFERENTES MESMA CLASSE
        
    }
    
}
