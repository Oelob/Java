package OOP.less04_homework;

public class DynamicMass<T> {
    
    private T[]array;
    
    public DynamicMass (){
        this.array = (T[]) new Object();
    };

    public DynamicMass (T[] mas){
        this.array = (T[]) new Object[mas.length];
        for (int i = 0, size = mas.length; i < size; i ++) {
            this.array[i] = mas[i];
        }
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
        array = temp;
    }
}
