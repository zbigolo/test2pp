package home;

public class mojefun implements funkcje{

    private  int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public mojefun(int number) {
        this.number = number;
    }

    public  mojefun(){}

    @Override
    public double W(int variable) {

        return Math.pow(variable, 4) + 3 * Math.pow(variable,2) - 2 * Math.pow(variable, 3) + (1 / 2.0) * variable - (1 / 7.0);
    }

    @Override
    public double F(int variable) {
        double tmp = 0;

        if (variable > 0)  tmp = Math.exp(2 * Math.PI * variable)  * Math.log(Math.abs(variable + 1))-1 / 7.0;

        return tmp;
    }

    @Override
    public int D(int variable) {
        int tmp = 0;

        if (variable  > 0) tmp = 1;
         else
             if(variable < 0) tmp = -1;

        return tmp;
    }

    @Override
    public double H(int variable) {

        return (2 * F(variable) + W(variable)) / 2.0;
    }

    @Override
    public double G(int variable) {

       return Math.exp(Math.sqrt(2* Math.PI * Math.abs(variable))) *(variable *variable + 2 * variable -1) / 2.0;
    }

    @Override
    public double A(int variable) {

        return H(variable)  + 2 * G(variable) + D(variable);
    }


    public static void main(String[] args) {

        mojefun testfunkcji = new mojefun(5);

        int x = testfunkcji.getNumber();
        

        System.out.println(testfunkcji.A(0));

        System.out.println(testfunkcji.W(x));
        System.out.println(testfunkcji.F(x));
        System.out.println(testfunkcji.D(x));
        System.out.println(testfunkcji.H(x));
        System.out.println(testfunkcji.G(x));
        System.out.println(testfunkcji.A(x));
    }
}
