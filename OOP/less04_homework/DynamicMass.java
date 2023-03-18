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
}
