package school;

public class drukarka implements matematyka{

   public String getValue(String text){
       return text;
   }

    @Override

    public double add(double number1, double number2) {

        return (number1 + number2);
    }

    @Override
    public double W(int number) {

        return (Math.pow(number, 3) - 2 * Math.pow(number, 6) -12);
    }

    @Override
    public String drukuj() {
        return getValue("Witaj Lato 2024");
    }


    public static void main(String[] args) {
        matematyka.wypisz("Konie Lata");

        drukarka test = new drukarka();

        System.out.println(test.W(7));
        System.out.println((test.add(10.0, -6.9)));

        test.drukuj();

    }

}
