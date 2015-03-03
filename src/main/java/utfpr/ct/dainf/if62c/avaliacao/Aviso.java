package utfpr.ct.dainf.if62c.avaliacao;
import java.util.TimerTask;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class Aviso extends TimerTask {
    
    protected final Compromisso compromisso;

    public Aviso(Compromisso compromisso) {
       this.compromisso = compromisso;
    }
    
    public Compromisso getCompromisso(){
        return compromisso;
    }
    
    @Override
    public void run(){
        long espera = compromisso.getData().getTime() - System.currentTimeMillis();
        System.out.println(compromisso.getDescricao()
                           + " começa em " + espera/1000 + "s");
    }
}
