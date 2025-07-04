package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void multiplicarDoisNumerosPositivos() {
        int a = 3;
        int b = 5;

        Calculadora cal = new Calculadora();
        int resultado = cal.multiplicarTest(a, b);
        assertEquals(15, resultado);
    }

    @Test
    void multiplicarDoisNumerosNegativos() {
        int a = -3;
        int b = -5;

        Calculadora cal = new Calculadora();
        int resultado = cal.multiplicarTest(a, b);
        assertEquals(15, resultado);
    }

    @Test
    void multiplicarPositivoeNegativo() {
        int a = -3;
        int b = 5;

        Calculadora cal = new Calculadora();
        int resultado = cal.multiplicarTest(a, b);
        assertEquals(-15, resultado);
    }

    @Test
    void dividirDoisNumerosPositivos() {
        int a = 10;
        int b = 2;

        Calculadora cal = new Calculadora();
        int resultado = cal.dividirTest(a, b);
        assertEquals(5, resultado);

    }

    @Test
    void dividirDoisNumerosNegativos() {
        int a = -10;
        int b = -2;

        Calculadora cal = new Calculadora();
        int resultado = cal.dividirTest(a, b);
        assertEquals(5, resultado);
    }

    @Test
    void dividirPositivoeNegativo() {
        int a = 10;
        int b = -2;

        Calculadora cal = new Calculadora();
        int resultado = cal.dividirTest(a, b);
        assertEquals(-5, resultado);

    }





}
