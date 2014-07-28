
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Main {

    public static void main(String[] args) {
        List<Jogador> time = new ArrayList<>();
        
        Jogador achado;
        
        time.add(new Jogador(2, "Fulano"));
        time.add(new Jogador(7, "Beltrano"));
        time.add(new Jogador(14, "Ciclano"));
        time.add(new Jogador(5, "Peça"));
        time.add(new Jogador(16, "Escravo"));
        time.add(new Jogador(22, "Servo"));
        time.add(new Jogador(7, "Fugitivo"));
        time.add(new Jogador(19, "Mendigo"));
        
        for(Jogador jog : time)
            System.out.println(jog);
        
        System.out.println();
        time.sort(new JogadorComparator(true,false));
        
        for(Jogador jog : time)
            System.out.println(jog);
        
        achado = time.get(Collections.binarySearch(time, new Jogador(19, "Mendigo"), new JogadorComparator(true,false)));
        
        System.out.println(achado);
    }
}
