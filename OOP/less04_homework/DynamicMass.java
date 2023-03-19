package OOP.less04_homework;
import OOP.less_figures.BaseFig;
import OOP.less_figures.Figures;
import OOP.less_figures.Length;
import OOP.less_figures.Polygon;
import OOP.less_figures.Rectangle;
import OOP.less_figures.Treangle;

public class DynamicMass<T extends Comparable<T>>{
    
    private T[]array;
    private int length;
    
    public DynamicMass (){
        this.array = (T[]) new Object();
        this.length = 0;
    };

    public DynamicMass (T[] mas){
        this.array = mas.clone();
        this.length = mas.length;
    }

    

    public void print(){
        StringBuilder sb = new StringBuilder("[");
        for (T el : this.array) {
            sb.append(" " + el + " ");
        }
        sb.append("]");
        System.out.println(sb);
    }
    
    public void addElement(T arg){
        T[] temp = (T[])new Object[this.array.length+1];
        for (int i = 0; i < this.array.length; i++) {
            temp[i] = this.array[i];
        }
        temp[temp.length-1] = arg;
        this.array = temp;
    }

    public void delElement(int index){
        
        T[] temp = (T[])new Object[this.array.length-1];
        System.arraycopy(this.array, 0, temp, 0, index);
        System.arraycopy(this.array, index+1, temp, index, this.array.length-index-1);
        this.array = temp;
    }

    public void delAllElement(T arg){
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == arg){
                T[] temp = (T[])new Object[this.array.length-1];
                System.arraycopy(this.array, 0, temp, 0, i);
                System.arraycopy(this.array, i+1, temp, i, this.array.length-i-1);
                this.array = temp;
            }  
        }
    }

    public T minElement(){
        if (length == 0) {
            return null;
        }
        T min = this.array[0];
        for (int i = 1; i < array.length; i++) {
            if ((((Comparable<T>) array[i]).compareTo(min))<0){
                min = array[i];
            };
        }
        return min;
    }

    public T maxElement(){
        if (length == 0) {
            return null;
        }
        T max = this.array[0];
        for (int i = 1; i < array.length; i++) {
            if ((((Comparable<T>) array[i]).compareTo(max))>0){
                max = array[i];
            };
        }
        return max;
    }

    public double sumElements() throws SumException{
        
        if (!(this.array[0] instanceof Number)) throw new SumException("Эти элементы нельзя сложить");
        double sum = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.array[i] instanceof Number) {
                sum += ((Number) this.array[i]).doubleValue();
            }
        }
        return sum;
    }

    public double multElements() throws SumException{
        
        if (!(this.array[0] instanceof Number)) throw new SumException("Эти элементы нельзя перемножить");
        double mult = 1;
        for (int i = 0; i < this.length; i++) {
            if (this.array[i] instanceof Number) {
                mult *= ((Number) this.array[i]).doubleValue();
            }
        }
        return mult;
    }
    

  

    
  


    
    
   
    
}
