package OOP.less04_homework;

public class program {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1,2,4,2,3};

        DynamicMass<Integer> dm = new DynamicMass<Integer>(array);
        dm.print();
        dm.addElement(5);
        dm.print();
    }
    
}
