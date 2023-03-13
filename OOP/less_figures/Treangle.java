package OOP.less_figures;

public class Treangle extends Polygon{

    private double a;
    private double b;
    private double c;
    

    public Treangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calcP() {
        return a+b+c;
    }


    @Override
    public double calcS() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
   
    @Override
    public String toString() {
        return String.format("%s Периметр: %.2f", super.toString(), calcP());
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
  

}
