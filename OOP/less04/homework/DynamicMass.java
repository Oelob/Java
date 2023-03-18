package homework;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DynamicMass <T extends Comparable<T>>{

    
    private ArrayList<T> mass;

    
    public DynamicMass (T[] mas){
        this.mass = new ArrayList<T>();
        for (int i = 0, size = mas.length; i < size; i ++) {
            this.mass.add(mas[i]);
        }
    }

    public DynamicMass (){
        T[] mass = (T[]) new Object();
    };
    
    public void addToMass(T obj){
        this.mass.add(obj);
        
    }
    public void removeElement(int index){
        this.mass.remove(index);
    }

    public void removeByValue(T value){
      
        for (int i = 0; i < this.mass.size(); i++) {
            if (mass.get(i) == value){
                this.mass.remove(mass.get(i));
                
            }
        }
       
    }

    public T minimal() throws ComperableEx{
        if (!(this.mass.get(0) instanceof Comparable)) throw new ComperableEx("несравниваемые элементы");
        Collections.sort(this.mass);
        return this.mass.get(0);
    }

    public T maximum() throws ComperableEx{
        if (!(this.mass.get(0) instanceof Comparable)) throw new ComperableEx("несравниваемые элементы");
        Collections.sort(this.mass);
        return this.mass.get(this.mass.size() -1 );
    }

    public int findIndex(T obj){
        return this.mass.indexOf(obj);
    }

    // public void sum(){
    //     if (this.mass instanceof Integer)
    // }

    public void printMass(){
        StringBuffer sb = new StringBuffer("[");
        for (T el : this.mass) {
            sb.append(" " + el.toString() + " ");
        }
        sb.append("]");

        System.out.println(sb);
    }

}
