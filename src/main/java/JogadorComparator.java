
import java.util.Comparator;

/**
 *
 * @author Gui_jaci@yahoo.com.br <gui_jaci@yahoo.com.br>
 */
public class JogadorComparator implements Comparator<Jogador> {
    private final boolean psqAlf, psqCres;
    
    public JogadorComparator(){
        psqAlf = false;
        psqCres = true;
    }
    
    public JogadorComparator(boolean psqAlf, boolean psqCres){
        this.psqAlf = psqAlf;
        this.psqCres = psqCres;
    }

    @Override
    public int compare(Jogador o1, Jogador o2) {
        if(psqAlf)
            return (psqCres?1:-1)*compareNome(o1,o2);
        return (psqCres?1:-1)*compareNum(o1,o2);
    }
    
    public int compareNum(Jogador o1, Jogador o2){
if(o1.getNumber() == o2.getNumber())
        {
            String nome1 = o1.getName();
            String nome2 = o2.getName();
            int length = nome1.length();

            if(length > nome2.length())
                length = nome2.length();
            
            for(int i = 0; i < length; i++){
                if(nome1.charAt(i) > nome2.charAt(i))
                    return 1;
                if(nome1.charAt(i) < nome2.charAt(i))
                    return -1;
            }
            
            if(nome1.length() < nome2.length())
                return 1;
            if(nome1.length() > nome2.length())
                return -1;
            
            return 0;
        }
        return o1.getNumber()-o2.getNumber();
    }
       
    public int compareNome(Jogador o1, Jogador o2) {       
        String nome1 = o1.getName();
        String nome2 = o2.getName();
        int length = nome1.length();

        if(length > nome2.length())
            length = nome2.length();
        
        for(int i = 0; i < length; i++){
            if(nome1.charAt(i) > nome2.charAt(i))
                return 1;
            if(nome1.charAt(i) < nome2.charAt(i))
                return -1;
        }
        
        if(nome1.length() < nome2.length())
            return 1;
        if(nome1.length() > nome2.length())
            return -1;
        
        if(o1.getNumber() != o2.getNumber())   
            return o1.getNumber()-o2.getNumber();
        return 0;
    }
}

