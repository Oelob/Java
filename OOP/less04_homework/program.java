package OOP.less04_homework;

public class program {
    public static void main(String[] args) {
        // Integer[] array = new Integer[] {5,2,4,1,2,3,5,4};
        String[] array = new String[]{"володя","петя","иван","андрей","аааа","аааб"};
        DynamicMass <String> dm = new DynamicMass<>(array);
        dm.print();
        // dm.addElement(7);
        // dm.print();
        // dm.delElement(4);
        // dm.print();
        // dm.delAllElement(4);
        // dm.print();
        // System.out.println(dm.maxElement());
        
        
    }
    
}
