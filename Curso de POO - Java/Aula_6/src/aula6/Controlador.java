
package aula6;

public interface Controlador // Lista de todos os metódos que precisam ser implementados para as classes que desejem ser 'Controlador'
{
    //METÓDOS ABSTRATOS
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligaMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
