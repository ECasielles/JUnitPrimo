package com.example.usuario.junitprimo;

import com.example.usuario.junitprimo.pojo.Primo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //Suite de pruebas
    @Test   //Aquí se puede indicar la duración máxima permitida para un método
    //Agregamos el método esPrimo_isCorrect
    public void esPrimo_isCorrect() throws Exception {
        //Métodos estáticos (ver assertNull, assertSame, etc.)
        assertFalse(Primo.esPrimo(-1));
        assertFalse(Primo.esPrimo(0));
        assertFalse(Primo.esPrimo(1));
        assertTrue(Primo.esPrimo(2));
        assertFalse(Primo.esPrimo(4));
        assertTrue(Primo.esPrimo(3));
    }
}