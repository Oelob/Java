package OOP.less_figures;

public class Circle extends BaseFig implements Length{

    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    

    @Override
    public String toString() {
    
        return String.format("%s Длина окружности: %.2f", super.toString(), calcLength());
    }

    @Override
    public double calcS() {
        return Math.PI*r*r;
    }

    @Override
    public double calcLength() {
        return 2*Math.PI*r;
    }

    public void setR(double r) {
        this.r = r;
    }


    
   

    
    
}
