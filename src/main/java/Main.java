
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Main {

    public static void main(String[] args) {
        int numJogadores, numero, ind;
        String nome;
        List<Jogador> time = new ArrayList<>();
        Scanner lerTeclado = new Scanner(System.in);
        Jogador achado;
        
        
        while(true){
            System.out.println("Selecione o numero de jogadores: ");
            if(lerTeclado.hasNextInt()){
                numJogadores = lerTeclado.nextInt();
                break;
            }else{
                System.out.println("Digite um numero por favor.");
                lerTeclado.next();
            }
        }
        
        for(int i = 0; i < numJogadores; i++){
            while(true){
                System.out.println("Digite o numero do jogador "+(i+1)+": ");
                if(lerTeclado.hasNextInt()){
                    numero = lerTeclado.nextInt();
                    System.out.println("Digite o nome do jogador "+(i+1)+": ");
                    nome = lerTeclado.next().trim();
                    time.add(new Jogador(numero,nome));
                    System.out.println("Jogador "+time.get(i)+" criado;");
                    break;
                }else{
                System.out.println("Digite um numero por favor.");
                lerTeclado.next();
                }
            }
        }
        
        
        for(Jogador jog : time)
            System.out.println(jog);
        
        System.out.println();
        time.sort(new JogadorComparator());
        
        for(Jogador jog : time)
            System.out.println(jog);
        
        while(true){
            System.out.println("Digite o numero do jogador para ser encontrado:");
            if(lerTeclado.hasNextInt()){
                numero = lerTeclado.nextInt();
                System.out.println("Digite o nome do jogador para ser encontrado:");
                nome = lerTeclado.next().trim();
                achado = new Jogador(numero,nome);
                break;
            }else{
            System.out.println("Digite um numero por favor.");
            lerTeclado.next();
            }
        }
        
        try{
            achado = time.get(Collections.binarySearch(time, achado, new JogadorComparator(true,false)));
            System.out.println(achado+" encontrado.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Este jogador nao foi encontrado.");
        }
        
        do{
            while(true){
                System.out.println("Digite o numero do jogador a ser adcionado(se não desejar adcionar nenhum, digite 0): ");
                if(lerTeclado.hasNextInt()){
                    ind = lerTeclado.nextInt();
                    break;
                }else{
                    System.out.println("Digite um numero por favor.");
                    lerTeclado.next();
                }
            }
            if(ind > 0){
                numero = ind;
                System.out.println("Digite o nome do jogador: ");
                nome = lerTeclado.next().trim();
                time.add(new Jogador(numero,nome));
            }
        }while(ind > 0);
        
        System.out.println();
        time.sort(new JogadorComparator());
        
        for(Jogador jog : time)
            System.out.println(jog);
    }
}
