package sample;

public class calculator {

    public int dodawanie(int liczba1, int liczba2){
        return (liczba1 + liczba2);
    }

    public static int signum(int number){
        int wynik = 0;

        if (number > 0) wynik = 1;
         else
             if (number < 0) wynik = -1;

        return wynik;
    }

    public int mnozenie(int liczba1, int liczba2) {
        return (liczba1 * liczba2);
    }

    static boolean isTriangle(int bok1,int bok2, int bok3){
        if((bok1+bok2 > bok3) && (bok2+bok3 > bok1) && (bok1+bok3 > bok2))
            return true;
        else
            return false;
    }

}
