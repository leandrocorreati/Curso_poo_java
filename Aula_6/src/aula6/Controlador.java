
package aula6;

public interface Controlador // Lista de todos os metódos que precisam ser implementados para as classes que desejem ser controlador
{
    //METÓDOS ABSTRATOS
    public abstract boolean ligar();
    public abstract boolean desligar();
    public abstract boolean abrirMenu();
    public abstract boolean fecharMenu();
    public abstract int maisVolume();
    public abstract int menosVolume();
    public abstract boolean ligaMudo();
    public abstract boolean desligarMudo();
    public abstract boolean play();
    public abstract boolean pause();
}
