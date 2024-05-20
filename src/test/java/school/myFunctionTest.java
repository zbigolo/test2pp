package school;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class myFunctionTest {

    @Test
    @DisplayName("Funkcja G - liczby dodaatnie")
    void testfunkcjaG_przypadekLiczbDodatnich(){

        int liczba = 2;
        double wartoscoczekiwana = 5.0;

        myFunction testfunkcjiG = new myFunction();
        double wartoscobliczona = testfunkcjiG.funkcjaG(liczba);

        Assertions.assertEquals(wartoscoczekiwana, wartoscobliczona);
    }

    @Test
    @DisplayName("Funkcja G - liczby ujemne")
    void testfunkcjaG_przypadekLiczbUjemnych(){

        int liczba = -4;
        double wartoscoczekiwana = 14.0;

        myFunction testfunkcjiG = new myFunction();
        double wartoscobliczona = testfunkcjiG.funkcjaG(liczba);

        Assertions.assertEquals(wartoscoczekiwana, wartoscobliczona);
    }

    @Test
    @DisplayName("Funkcja F - liczby dodatnie")
    void testfukcjaF_przypadekLiczbyDodatnie(){

        int liczba = 1;
        int wartoscoczekiwana = 0;
        int wartoscobliczona = myFunction.funkcjaF(liczba);

        Assertions.assertEquals(wartoscoczekiwana, wartoscobliczona);
    }

    @Test
    @DisplayName("Funkcja F - liczby ujemne")
    void testfukcjaF_przypadekLiczbyUjemne(){

        int liczba = -2;
        int wartoscoczekiwana = 2;
        int wartoscobliczona = myFunction.funkcjaF(liczba);

        Assertions.assertEquals(wartoscoczekiwana, wartoscobliczona);
    }

    @Test
    @DisplayName("Funkcja F - liczba 0")
    void testfukcjaF_przypadekLiczba0(){

        int liczba = 0;
        int wartoscoczekiwana = 6;
        int wartoscobliczona = myFunction.funkcjaF(liczba);

        Assertions.assertEquals(wartoscoczekiwana, wartoscobliczona);
    }
}
