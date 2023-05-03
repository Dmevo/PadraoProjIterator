package iterator;

import java.util.Iterator;

public class Ministerio {

    public static Integer contarTrabalhadoresAposentados(Populacao populacao) {
        int quantidade = 0;
        for (Trabalhador trabalhador : populacao) {
            if (trabalhador.isAposentado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTrabalhadoresEmpregados(Populacao populacao) {
        int quantidade = 0;
        for (Trabalhador trabalhador : populacao) {
            if (trabalhador.isEmpregado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalTrabalhadores(Populacao populacao) {
        int quantidade = 0;
        for (Iterator a = populacao.iterator(); a.hasNext();) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
