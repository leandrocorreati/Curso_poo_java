
package aula6;

public class ControleRemoto implements Controlador
{
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //METÓDO CONSTRUTOR
    public ControleRemoto() 
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //METÓDOS ACESSORES
    private int getVolume() 
    {
        return volume;
    }

    private void setVolume(int V) 
    {
        this.volume = V;
    }

    private boolean getLigado() 
    {
        return ligado;
    }

    private void setLigado(boolean l) 
    {
        this.ligado = l;
    }

    private boolean getTocando() 
    {
        return tocando;
    }

    private void setTocando(boolean t) 
    {
        this.tocando = t;
    }

    //METÓDOS ABSTRATOS DA INTERFACE(CONTROLADOR)IMPLEMENTADOS
     @Override
    public void ligar() 
    {
        setLigado(true);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desligar() 
    {
        setLigado(false);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abrirMenu() 
    {
        System.out.println(getLigado());
        System.out.println(getVolume());
        for(int i = 0; getVolume() > 10;i++)
        {
            System.out.println("|"); 
        }
        System.out.println("" + getTocando());
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fecharMenu() 
    {
        System.out.println("Fechando Menu");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void maisVolume() 
    {
        if (getLigado()==true)
        {
            setVolume(getVolume() + 1);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menosVolume() 
    {
        if (getLigado()==true)
        {
            setVolume(getVolume() - 1);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ligaMudo() 
    {
        if (getLigado()== true && getVolume() > 0 )
        {
           setVolume(0); 
        }
            
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desligarMudo() 
    {
        if (getLigado()== true && getVolume() == 0 )
        {
           setVolume(50); 
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void play() 
    {
        if(getLigado() == true && getTocando() == false)
        {
            setTocando(true);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pause() 
    {
         if(getLigado() == true && getTocando() == true)
        {
            setTocando(false);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
