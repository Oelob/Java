package OOP.less_figures;

import java.util.Comparator;

public class SquareComporator implements Comparator<BaseFig>{

    @Override
    public int compare(BaseFig o1, BaseFig o2) {
        try {
            return Double.compare(o1.calcS(), o2.calcS());
        } catch (RadiusException | SideException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }
    
}
