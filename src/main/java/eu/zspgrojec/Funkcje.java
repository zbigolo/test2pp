package eu.zspgrojec;

public class Funkcje {

    public static double W(int x){
        double temp = 1/2.0 *(x * x * x) - 2 * x * x +4 / 5.0 * x - 1 / 7.0;
        return temp;
    }

    public static double F(int x){
        double temp = Math.exp(Math.sqrt(Math.abs(x))) * Math.sqrt(2 * Math.PI*x *x);
        return temp;
    }

    public static int D(int x){
        int temp = 0;

        if (x > 0) temp = 1;
         else
             if(x < 0) temp = -1;

        return temp;
    }

    public static double H(int x){
        double temp = (W(x) + 2 *F(x) - D(x)) / (2* W(x) + D(x));
        return temp;
    }

    public static double A(int x) {
        double temp = W(x) * sample.Gauss(x);
        return temp;
    }

    public static void printWynik(double y){
        System.out.println(y);
    }
}
