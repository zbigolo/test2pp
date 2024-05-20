package school;

public class myFunction {

    public static int funkcjaF(int liczba){
        int wynik = 0;

        if (liczba > 0) wynik = -1 * liczba + 1;
          else wynik = 2 * liczba + 6;

        return wynik;
    }

    public double funkcjaG(int liczba){

        return (liczba + 2 * liczba * liczba) / 2.0;
    }
}
