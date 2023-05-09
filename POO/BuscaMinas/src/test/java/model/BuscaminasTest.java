package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BuscaminasTest {
    private GeneradorTableros generadorTableros;
    private Buscaminas buscaminas;

    @BeforeEach
    void setUp() {
        generadorTableros = Mockito.mock(GeneradorTableros.class);
        String[][] taula = new String[][]{
                {" * ", "   ", "   ", "   ", "   "},
                {"   ", " * ", "   ", " * ", "   "},
                {"   ", "   ", " * ", "   ", "   "},
                {"   ", " * ", "   ", " * ", "   "},
                {"   ", "   ", "   ", "   ", " * "}
        };
        Mockito.when(generadorTableros.generarTableroConMinas(Mockito.anyInt())).thenReturn(taula);
        Mockito.when(generadorTableros.generarTableroVacio()).thenReturn(new String[5][5]);
        generadorTableros = new GeneradorTableros(5, 5);
        buscaminas = new Buscaminas(generadorTableros, 9);
    }

    @Test
    void detectarMinas() {
        buscaminas.detectarMinas();
    }

    @Test
    void testDetectarMinas() {
        buscaminas.detectarMinas(0, 2);
        buscaminas.detectarMinas(4, 3);
        buscaminas.detectarMinas(2, 4);
        buscaminas.detectarMinas(2, 0);
        buscaminas.detectarMinas(1, 2);
    }

    @Test
    void seleccionaCasilla() {
        buscaminas.seleccionaCasilla(1, 2);
        buscaminas.seleccionaCasilla(2, 4);
        buscaminas.seleccionaCasilla(0, 3);
        buscaminas.seleccionaCasilla(2, 4);
        buscaminas.seleccionaCasilla(3, 3);
        buscaminas.seleccionaCasilla(1, 0);
        buscaminas.seleccionaCasilla(2, 3);
        buscaminas.seleccionaCasilla(1, 3);
        buscaminas.seleccionaCasilla(2, 4);
        buscaminas.seleccionaCasilla(4, 1);
    }

    @Test
    void hayGanador() {
        buscaminas.hayGanador();
    }

    @Test
    void esFinalizado() {
        buscaminas.esFinalizado();
    }

    @Test
    void terminadoConVictoria() {
        buscaminas.terminadoConVictoria();
    }
}