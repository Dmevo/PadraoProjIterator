package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinisterioTest {

    @Test
    void deveContarTotalTrabalhadoresAposentados() {
        Populacao populacao = new Populacao(
                new Trabalhador("Danilo", false, true),
                new Trabalhador("Yan", false, false),
                new Trabalhador("Rodrigo", true, false)
        );
        assertEquals(1, Ministerio.contarTrabalhadoresAposentados(populacao));
    }

    @Test
    void deveContarTotalTrabalhadoresEmpregados() {
        Populacao populacao = new Populacao(
                new Trabalhador("Danilo", false, true),
                new Trabalhador("Yan", false, false),
                new Trabalhador("Rodrigo", true, false)
        );
        assertEquals(1, Ministerio.contarTrabalhadoresEmpregados(populacao));
    }

    @Test
    void deveContarTotalTrabalhadores() {
        Populacao populacao = new Populacao(
                new Trabalhador("Danilo", false, true),
                new Trabalhador("Yan", false, false),
                new Trabalhador("Rodrigo", true, false)
        );
        assertEquals(3, Ministerio.contarTotalTrabalhadores(populacao));
    }
}
