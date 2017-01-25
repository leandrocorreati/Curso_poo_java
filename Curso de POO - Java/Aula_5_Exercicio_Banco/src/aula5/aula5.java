package aula5;

import java.util.Scanner;

public class aula5
{
    public static void main(String[] args)
    {
        ContaBancaria cb = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria();
        Scanner teclado = new Scanner(System.in);
        String tipo;
        
        System.out.println("*** Qual a tipo de conta deseja abrir ? ***");
        System.out.println("*** Se deseja abrir conta corrente digite [cc], se for conta poupança digite [cp] ***");
        tipo = teclado.nextLine();
        cb.setNumConta(14106);
        cb.setDono("Leandro");
        cb.abrirConta(tipo);
        cb.depositar(500f);
        
        cb.extrato();
        
        
        cb2.setNumConta(14106);
        cb2.setDono("Larissa");
        cb2.abrirConta("cp");
        cb2.sacar(100f);
        cb2.extrato();
        //cb.fecharConta();
    }
    
}
