/**
 * @author Guilherme Jacichen email:<gui_jaci@yahoo.com.br>
 */
public class Jogador implements Comparable{
    private final int numero;
    private final String nome;

    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumber() {
        return numero;
    }

    public String getName() {
        return nome;
    }
}