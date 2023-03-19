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
        // System.out.println(dm.indexElement(3));
        // System.out.println(dm.indexElement(5));
        // System.out.println(dm.inArray(5));
        // dm.bubbleSort();
        dm.insertionSort();
        dm.print();
        
    }
    
}
