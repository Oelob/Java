package OOP.les01.les02;

public class Circle extends BaseFig{

    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    public double Length(){
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
    
        return String.format("%s Длина окружности: %.2f", super.toString(), this.Length());
    }

    @Override
    double calcS() {
        return Math.PI*(r*r);
    }
    
}
