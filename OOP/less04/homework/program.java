package homework;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) throws ComperableEx {
      Integer[] mass = new Integer[] {1,2,5,4,5,8};
      DynamicMass<Integer> dm = new DynamicMass<Integer>(mass);
      dm.printMass();
      // dm.addToMass(3);
      // dm.removeElement(1);
      // dm.removeByValue(5);
      System.out.println(dm.maximum());
      System.out.println(dm.minimal());
      dm.printMass();
      

       



    }
    
}
