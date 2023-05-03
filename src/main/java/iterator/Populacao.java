package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Populacao implements Iterable<Trabalhador> {

    private List<Trabalhador> trabalhadores = new ArrayList<>();

    public Populacao(Trabalhador... trabalhadores) { this.trabalhadores = Arrays.asList(trabalhadores); }

    @Override
    public Iterator<Trabalhador> iterator() {
        return trabalhadores.iterator();
    }
}
