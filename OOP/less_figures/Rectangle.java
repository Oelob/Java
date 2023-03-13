package OOP.less_figures;

import java.util.Scanner;

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
        return String.format("%s Сторона А: %.2f Сторона B: %.2f Периметр: %.2f", super.toString(), this.a, this.b, calcP());
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



    @Override
    public void set() {
        setA();
        setB();
    }

   
}
