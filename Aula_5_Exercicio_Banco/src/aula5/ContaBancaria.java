  
package aula5;

import java.util.HashSet;
import java.util.Set;

public class ContaBancaria
{
    //======================================== ATRIBUTOS =================================================//
    
    public int numConta;
    protected String tipo;        // Se tipo de conta for poupança há um acrescimo de 150,00 e 50,00 se for corrente!!!!
    private String dono;
    private float saldo;
    private boolean situacao;   // Se conta estiver aberta situacao é true, se estiver fechada false!!!

    //======================================== METÓDO CONSTRUTOR =================================================//
    
    public ContaBancaria() 
    {
        //Existem duas formas de aplicar os valores nos atributos com o metódo construtor:
        
        // 1º FORMA (PASSANDO VALOR PARA OS ATRIBUTOS)
        this.saldo = 0; 
        this.situacao = false;
        
        // 2º FORMA (CHAMANDO OS METÓDOS ACESSORES E PASSANDO O VALOR PARA O PARAMETRO DELES())
        this.setSaldo(0f);
        this.setSituacao(false);
    }

    //======================================== METÓDOS PERSONALIZADOS =================================================//
    
    public void abrirConta(String t)
    {
        this.setTipo(t);
  // this.situacao = true; //Há duas formas de alterar o atributo 'situacao', são elas 1º pelo: alterando diretamente pelo "this.atributo = algumacoisa" -
        this.setSituacao(true);   //ou pelo metódo acessor nesse caso o "setSituação()" que recebe como parametro(dentro dos parenteses)"true".
        
        if ("cc".equals(t))
        {
            setSaldo(50.00f);
        }
        
        if ("cp".equals(t))
        {
            setSaldo(150.00f);
        }
        
        
    }
    
    public void fecharConta() // Só e possivel fechar a conta se não houver credito e debito!!!!
    {
        if(saldo == 0 )
        {
            this.situacao = false;
            System.out.println("Sua conta foi fechada ");
        }
        else
        {
            this.situacao = true;
            System.out.println("Não é possivel fechar sua conta !!! Verifique o saldo.");
        }
    }
    
    public void depositar(float v) // Para depositar é nescessario a conta estar aberta!!!
    {
        if (situacao == true)
        {
            saldo = saldo + v;
        }
        else
        {
            System.out.println(" Não é possivel depositar - Verifique a situação de sua conta.");
        }
    }
    
    public void sacar(float v) // Para sacar é nescessario a conta estar aberta!!!
    {
        if (situacao == true)
        {
            if(saldo >= v)
            {
                saldo =saldo - v ;
                System.out.println("Saque realizado: " + getDono());
                System.out.println("Nº da conta: " + getNumConta());
            }
            else 
            {
                System.out.println("Saldo insuficiente");
                System.out.println("saldo atual " + getSaldo());
            }
        }
        else
        {
            System.out.println(" Não é possivel sacar - Verifique a situação de sua conta.");
        }
        
    }
        
    public void cestaServico() // 12,00 é cobrada por conta-corrente , 20,00 poupança
    {
        float v = 0;
        if ("cc".equals(tipo))
        {
            v = 12.00f;
        }
        if("cp".equals(tipo))
        {
            v = 20.00f;
        }
        if (situacao == true)
        {
            if(saldo > v)
            {
                saldo = saldo - v ;
            }else
                System.out.println("Saldo Insuficiente");
        }else
            System.out.println(" Impossivel Pagar - Verifique a situação de sua conta ");
        
    }
    
    public void extrato()
    {
        System.out.println("======Extrato Bancário======");
        System.out.println("Conta " + getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Número da Conta: "+ this.getNumConta());
        System.out.println("Saldo R$: "+ this.getSaldo());
                if (this.isSituacao()== true)
        {
            String estado = "Aberta";
            System.out.println(" Situação: "+ estado);
        }
        else
        {
            String estado = "Fechada";
            System.out.println("Situação: "+ estado);
        }
        
    }
    
    //======================================== METÓDOS GETTERS E SETTERS =================================================//
    
    public int getNumConta() 
    {
        return numConta;
    }

    public void setNumConta(int numConta) 
    {
        this.numConta = numConta;
    }

    
    public String getTipo() 
    {
        return tipo;
    }

    
    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    
    public String getDono() 
    {
        return dono;
    }

    
    public void setDono(String dono) 
    {
        this.dono = dono;
    }

    
    public float getSaldo() 
    {
        return saldo;
    }

    
    public void setSaldo(float saldo) 
    {
        this.saldo = saldo;
    }

    
    public boolean isSituacao() 
    {
        return situacao;
    }

    
    public void setSituacao(boolean situacao) 
    {
        this.situacao = situacao;
    }
    
    
          
    
}
