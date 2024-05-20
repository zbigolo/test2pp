package sample;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

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

        Assertions.assertEquals(wynikoczekiwany, wynikobliczony);

    }

    @Test
    @DisplayName("Sample Asserations")
    //@RepeatedTest(value = 10, name = LONG_DISPLAY_NAME)
    @Disabled
    void sampleTest(){
     /*
        Dokumentacja JUnit 5 Asserations
        https://junit.org/junit5/docs/5.9.1/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html



        Assertions.assertEquals( expected, actual );
        Assertions.assertNotEquals( expected, actual);

        Assertions.assertNotNull( actualNull);
        Assertions.assertNull( actualNull );

        Assertions.assertArrayEquals( actualArray, expectedArray );

        Assertions.assertTrue(condition);
        Assertions.assertFalse(condition);

        Assertions.assertSame(expectedObject, actualObject);
        Assertions.assertNotSame(expectedObject, actualObject);

        Assertions.assertAll( conditionAll);

        Assertions.assertIterableEquals(expectedIterable, actualIterable);

        Assertions.assertInstanceOf(expectedObject, actualObject);

    */

      String[] names = {"James", "John", "Kitten", "Linda", "Dr. No", "Philipp"};
      String[] names1 = {"James", "John", "Kitten", "Linda", "Dr. No", "Philipp"};
      String names2 = null;

      List<String> nameStudent = Arrays.asList("James", "John", "Kitten", "Linda", "Dr. No");







        System.out.println("assertEquals");
        Assertions.assertEquals(names[0],names1[0],"Spodziewano się jednakowych loginow");
        //Assertions.assertEquals(names[0],names1[1]);
        System.out.println("assertNotEquals");
        Assertions.assertNotEquals(names[2],names1[0],"Spodziewano się różnych loginow");


        System.out.println("assertNotNull");
        Assertions.assertNotNull(names,"Spodziewano się dowolnego loginu uzytkownika");

        System.out.println("assertNull");
       Assertions.assertNull(names2,"Sprawdzenie czy istnieje pusty login");



        System.out.println("assertArrayEquals");
        Assertions.assertArrayEquals(names,names1,"Sprawdzenie tablic loginów czy są jednakowe");




        System.out.println("assertFalse");
        Assertions.assertFalse(nameStudent :: isEmpty,"Spodziewano się pustego objektu");

        System.out.println("assertTrue");
        Assertions.assertTrue(names.length == names1.length ,"Spodziewano się że tablice loginów mają tyle samo danych");
        Assertions.assertTrue(names[0] != "John" ,"Sprawdzam czy na 2 pozycji jest John");



        String[] nazwa = names1;

        System.out.println("assertSame");
        Assertions.assertSame(nameStudent, nameStudent,"Spodziewano jednakowych obiektów");
        Assertions.assertSame(names1, nazwa,"Spodziewano jednakowych obiektów");

        System.out.println("assertNotSame");
        Assertions.assertNotSame(names,names1,"Spodziewano się różnych obiektów");

        System.out.println("assertAll");
        Assertions.assertAll(
                () -> Assertions.assertTrue(nameStudent.contains("Linda"), "Linda"),
                () -> Assertions.assertFalse(nameStudent.contains("Bravo"))
        );

        System.out.println("assertInstanceOf");
        Assertions.assertInstanceOf(String.class, names1[0],"Spodziewano się obiektu typy String");
        Assertions.assertInstanceOf(Integer.class, calculator.signum(10), "spodziewano się obiektu typu int");
    }
}
