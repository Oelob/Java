package OOP.less_figures;

import java.util.Comparator;

public class SquareComporator implements Comparator<BaseFig>{

    @Override
    public int compare(BaseFig o1, BaseFig o2) {
        return Double.compare(o1.calcS(), o2.calcS());
    }
    
}
