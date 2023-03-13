package OOP.less_figures;

import java.util.Scanner;

public class Circle extends BaseFig implements Length{

    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    

    @Override
    public String toString() {
    
        return String.format("%s Радиус: %.2f Длина окружности: %.2f", super.toString(), this.r, calcLength());
    }

    @Override
    public double calcS() {
        return Math.PI*r*r;
    }

    @Override
    public double calcLength() {
        return 2*Math.PI*r;
    }

    public void setR() {
        System.out.println("Введите размер радиуса");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        this.r = num;
    }



    @Override
    public void set() {
        setR();
    }


    
   

    
    
}
