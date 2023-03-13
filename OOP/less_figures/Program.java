package OOP.less_figures;

import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class Program {

    public static void main(String[] args) {

        Figures storage = new Figures();
        storage.addFig(new Treangle("Treangle", 2, 2, 2));
        storage.addFig(new Square("Square", 3));
        storage.addFig(new Circle("Circle", 5));
        storage.addFig(new Rectangle("Rectangle", 3, 4));



        System.out.println(storage.getAllInfo());
        // storage.getChanges();
        // System.out.println(storage.getAllInfo());
        // storage.changeFig(new Square("new sq", 10));
        // System.out.println(storage.getAllInfo());
        storage.sort();
        System.out.println(storage.getAllInfo());
       
        


        





        
          
    }
    
}
