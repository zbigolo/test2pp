package eu.zspgrojec;

public class SampleFunction {

    static void Drukuj(String napis){

        System.out.println(napis + " " + napis);

    }

    public int Suma(int liczba1, int liczba2){

        return (liczba1 + liczba2);
    }


    public static void main(String[] args) {

        // użycie funkcji static
        Drukuj("Dziś kartkówka");
        Drukuj("W czwartek mamy ferie wiosenne.");
        
        
        // użycie funkcji non-static
       // int suma = Suma(10, 7);

        SampleFunction myfunction = new SampleFunction();

        int wynik = myfunction.Suma(10, 7);












        System.out.println(myfunction.Suma(100, -100));

        int obliczsume = myfunction.Suma(100, myfunction.Suma(10, 7));

        int suma2 = myfunction.Suma(10000, new SampleFunction().Suma(200, 201));

        System.out.println(wynik + "\n" + obliczsume + "\n" + suma2);

    }

}
