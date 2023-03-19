package OOP.less04_homework;

import OOP.less_figures.RadiusException;

public interface Comparator<T> {

    public int compare(T a, T b) throws RadiusException;
    
    
}
