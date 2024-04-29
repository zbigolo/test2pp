package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    @DisplayName("signum - przypadek liczby dodatnie")
    void signumDlaLiczbyDodatniej(){
        // dane
        int mojaLiczba = 5;

        // wynik oczekiwany

        int wynikoczekiwany = 1;

        Assertions.assertEquals(wynikoczekiwany, calculator.signum(mojaLiczba));
    }

    @Test
    @DisplayName("signum - przypadek liczby ujemnej")
    void signumDlaLiczbyUjemnej(){
        // dane
        int mojaLiczba = -7;

        // wynik oczekiwany

        int wynikoczekiwany = -1;

        Assertions.assertEquals(wynikoczekiwany, calculator.signum(mojaLiczba));
    }

    @Test
    @DisplayName("signum - przypadek liczbyzero")
    void signumDlaLiczbyZero(){
        // dane
        int mojaLiczba = 0;

        // wynik oczekiwany

        int wynikoczekiwany = 0;

        Assertions.assertEquals(wynikoczekiwany, calculator.signum(mojaLiczba));
    }

    @Test
    @DisplayName("dodawanie - 2 liczby dodatnie")
    void dodawanieDlaObuLiczbDodatnich(){
        int liczba1 = 10;
        int liczba2 = 123;

        int wynikoczekiwany = 133;

        calculator test = new calculator();
        int wynikobliczony = test.dodawanie(liczba1, liczba2);

        Assertions.assertEquals(wynikoczekiwany, wynikobliczony);
    }


    @Test
    @DisplayName("mnozenie -")
    void mnozenieDlaDwochLiczb(){
        int liczba1 = 10;
        int liczba2 = -123;

        int wynikoczekiwany = -1230;

        calculator test = new calculator();
        int wynikobliczony = test.mnozenie(liczba1, liczba2);

        Assertions.assertEquals(wynikoczekiwany, wynikobliczony,"Jesk OK");

    }

}
