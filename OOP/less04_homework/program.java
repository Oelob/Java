package OOP.less04_homework;
import OOP.less_figures.BaseFig;
import OOP.less_figures.Circle;
import OOP.less_figures.Figures;
import OOP.less_figures.Length;
import OOP.less_figures.Polygon;
import OOP.less_figures.Rectangle;
import OOP.less_figures.Treangle;

public class program {
    public static void main(String[] args) throws SumException {
        // String[] array = new String[]{"володя","петя","иван","андрей","аааа","аааб"};
        // Rectangle rectangle = new Rectangle("прямоугольник", 2, 4);
        // Treangle treangle = new Treangle("треугольник", 2, 3, 4);
        // Circle circle = new Circle("михаил", 3);
        // Circle circle2 = new Circle("михаил", 5);
        // Figures storage = new Figures();
        // storage.addFig(circle);
        // storage.addFig(circle2);
        // Circle[] array5 = new Circle[]{circle,circle2};
        
        
        
        Integer[] array = new Integer[] {5,2,4,1,2,3,5,4};
        // String[] array = new String[]{"15"," 13","15","12","аааа","аааб"};
        DynamicMass <Integer> dm = new DynamicMass<>(array);
        dm.print();
        // dm.addElement(7);
        // dm.print();
        // dm.delElement(4);
        // dm.print();
        // dm.delAllElement(4);
        // dm.print();
        // System.out.println(dm.maxElement());
        // System.out.println(dm.multElements());
        
        
    }
    
}
