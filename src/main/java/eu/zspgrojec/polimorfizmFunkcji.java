package eu.zspgrojec;

public class polimorfizmFunkcji {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public polimorfizmFunkcji(){
        setName("Kowalski");
    }



    public  static void Drukuj(String napis){

        System.out.println(napis);

    }

     static void Drukuj(String text, boolean wartosc){

        if (wartosc) System.out.println(text);
         else System.out.println(text + text + text);
    }

    public static void Drukuj(int liczba1, int liczba2){

        System.out.println(liczba1 +" + " + liczba2 + " = " + (liczba1 + liczba2));
    }

    private static void Drukuj (double liczba){
        System.out.println(liczba / 100);
    }

    public void Drukuj(polimorfizmFunkcji name){
        System.out.println(getName());
    }



    public static void Drukuj2(int liczba1, int liczba2){

        System.out.println(liczba1 +" + " + liczba2 + " = " + (liczba1 + liczba2));
    }

    public static void main(String[] args) {

        Drukuj(100);

        polimorfizmFunkcji dane = new polimorfizmFunkcji();
        dane.Drukuj("Tola");

    }
}
