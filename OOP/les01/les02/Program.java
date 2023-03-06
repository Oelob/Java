package OOP.les01.les02;

public class Program {

    public static void main(String[] args) {

        BaseFig[] mass = new BaseFig[4];
        mass[0] = new Treangle("Treangle", 2, 2, 2);
        mass[1] = new Squer("Squer", 2);
        mass[2] = new Circle("Circle", 3);
        mass[3] = new Rectangle("Rectangle", 2, 3);


        for (BaseFig element : mass) {
            System.out.println(element);
        }

        
    }
    
}
