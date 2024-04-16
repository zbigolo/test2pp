package eu.zspgrojec;

public class sample {

    public static void Drukuj(){

        System.out.println("Zbigniew Golebiewski");

    }

    static void Print(String textToPrint){

        System.out.println(textToPrint);

    }

    static int add(int liczba1, int liczba2){

        return (liczba1 + liczba2);

    }

    static double divNumberTen(double number){

        return (number / 10);

    }

    public static double Gauss(int x) {

        double temp = Math.exp(2 * Math.PI * x) / Math.sqrt(Math.PI);

        return temp;
    }

    public static void main(String[] args) {

        System.out.println("Dzialanie funkcji Drukuj");
        Drukuj();

        System.out.println("\n \n Dzialanie funkcji Print");
        Print("Witaj swiecie");

        System.out.println("\n \n Dzialanie funkcji add");
        System.out.println(add(100,12));

        System.out.println("\n \n Dzialanie funkcji divNumberTen");
        System.out.println(divNumberTen(210.2));


    }
}
