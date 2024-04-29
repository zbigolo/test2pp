package home;

public class mojeFigury implements fig{

    String name = "kwadrat";
    double bok;

    public void setBok(double bok) {
        this.bok = bok;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPole() {
        return bok * bok;
    }

    @Override
    public String getFigurName(String name) {
        return name;
    }

    public static void main(String[] args) {

        mojeFigury kwadrat = new mojeFigury();
        System.out.println(kwadrat.getFigurName(kwadrat.getName()));
        kwadrat.setBok(10.2);

        System.out.println(kwadrat.getPole());
    }
}
