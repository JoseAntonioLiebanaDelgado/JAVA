package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneradorTablerosTest {


    //Prueba 1
    @Test
    void test1() {
        GeneradorTableros gt = new GeneradorTableros(5,5);
        gt.generarTableroConMinas(0);
    }

    //Prueba 2
    @Test
    void test2(){
        GeneradorTableros gt = new GeneradorTableros(5,5);
        gt.generarTableroConMinas(5);
    }

    //Prueba 3
    @Test
    void test3() {
        GeneradorTableros gt = new GeneradorTableros(5,5);
        String[][] taula = new String[][] {
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " }
        };
        assertEquals(gt.generarTableroConMinas(30),taula);
    }

    //Prueba 4
    @Test
    void test4(){
        GeneradorTableros gt = new GeneradorTableros(5,5);
        String[][] taula = new String[][] {
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " }
        };
        assertEquals(gt.generarTableroConMinas(-10),taula);
    }
}

//--------------------------------------------------------------------------------------------------

/*
package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneradorTablerosTest {


    //Prueba 1
    @Test
    void test1() {
        GeneradorTableros gt = new GeneradorTableros(5,5);
        gt.generarTableroConMinas(0);
    }

    //Prueba 2
    @Test
    void test2(){
        GeneradorTableros gt = new GeneradorTableros(5,5);
        gt.generarTableroConMinas(5);
    }

    //Prueba 3
    @Test
    void test3() {
        GeneradorTableros gt = new GeneradorTableros(5,5);
        String[][] taula = new String[][] {
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " },
                { " * ", " * ", " * ", " * ", " * " }
        };
        assertEquals(gt.generarTableroConMinas(27),taula);
    }

    //Prueba 4
    @Test
    void test4(){
        GeneradorTableros gt = new GeneradorTableros(5,5);
        String[][] taula = new String[][] {
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   " }
        };
        assertEquals(gt.generarTableroConMinas(-3),taula);
    }
}*/