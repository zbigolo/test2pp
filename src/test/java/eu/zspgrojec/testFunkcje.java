package eu.zspgrojec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testFunkcje {

    @Test
    @DisplayName("Test funkcji W(x)")
    public void testW(){

        double expected = -0.14285714285714285;
        double actual = Funkcje.W(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test funkcji D(x) : x = 0")
    public void testD_1(){

        double expected = 0;
        double actual = Funkcje.D(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test funkcji D(x) : x = 10")
    public void testD_2(){

        double expected = 1;
        double actual = Funkcje.D(10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test funkcji D(x) : x = -5")
    public void testD_3(){

        double expected = -1;
        double actual = Funkcje.D(-5);
        Assertions.assertEquals(expected, actual);
    }
}
