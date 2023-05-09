package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneradorTablerosTest {


    //Prueba 1
    @Test
    void test1() {
        GeneradorTableros gt = new GeneradorTableros(6, 6);
        gt.generarTableroConMinas(0);
    }

    //Prueba 2
    @Test
    void test2() {
        GeneradorTableros gt = new GeneradorTableros(6, 6);
        gt.generarTableroConMinas(8);
    }

    //Prueba 3
    @Test
    void test3() {
        GeneradorTableros gt = new GeneradorTableros(5, 6);
        String[][] taula = new String[][]{
                {" * ", " * ", " * ", " * ", " * "},
                {" * ", " * ", " * ", " * ", " * "},
                {" * ", " * ", " * ", " * ", " * "},
                {" * ", " * ", " * ", " * ", " * "},
                {" * ", " * ", " * ", " * ", " * "},
                {" * ", " * ", " * ", " * ", " * "}
        };
        assertEquals(gt.generarTableroConMinas(37), taula);
    }

    //Prueba 4
    @Test
    void test4() {
        GeneradorTableros gt = new GeneradorTableros(6, 6);
        String[][] taula = new String[][]{
                {"   ", "   ", "   ", "   ", "   ", "   "},
                {"   ", "   ", "   ", "   ", "   ", "   "},
                {"   ", "   ", "   ", "   ", "   ", "   "},
                {"   ", "   ", "   ", "   ", "   ", "   "},
                {"   ", "   ", "   ", "   ", "   ", "   "},
                {"   ", "   ", "   ", "   ", "   ", "   "}
        };
        assertEquals(gt.generarTableroConMinas(-3), taula);
    }
}