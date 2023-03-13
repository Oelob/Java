package OOP.less_figures;

import java.util.Scanner;

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
    public double calcS() throws SideException {
        if (a<=0|b<=0|c<=0) throw new SideException("Площад фигуры равна 0, фигуры не существует");
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
   
    @Override
    public String toString() {
        return String.format("%s Сторона А: %.2f Сторона B: %.2f Сторона C: %.2f Периметр: %.2f", super.toString(), this.a, this.b, this.c, calcP());
    }
    public void setA() {
        System.out.println("Введите размер стороны А");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        this.a = num;
    }
    public void setB() {
        System.out.println("Введите размер стороны B");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        this.b = num;
    }
    public void setC() {
        System.out.println("Введите размер стороны C");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        this.c = num;
    }

    @Override
    public void set() {
        setA();
        setB();
        setC();
    }
  
}
