package OOP.less_figures;

public class Rectangle extends Polygon{
    private double a;
    private double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    

    @Override
    public double calcS() {
        return a*b;
    }


    @Override
    public double calcP() {
        return (a+b)*2;
    }

    @Override
    public String toString() {
        return String.format("%s Периметр: %.2f", super.toString(),calcP());
    }
    
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

   
}
