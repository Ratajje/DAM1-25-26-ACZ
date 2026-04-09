package ud5.SetConjuntos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sorteo<T> {

    private Set<T> valoresPosibles;

    public Sorteo() {
        this.valoresPosibles = new LinkedHashSet<>();
    }

    public boolean add(T elemento) {
        return valoresPosibles.add(elemento);
    }


    public Set<T> premiados(int numPremiados) {

        List<T> auxiliar = new ArrayList<>(valoresPosibles);
        Collections.shuffle(auxiliar);

        Set<T> res = new LinkedHashSet<>();
        
        res.addAll(auxiliar.subList(0, Math.min(numPremiados, valoresPosibles.size())));

        return res;
    }

}
