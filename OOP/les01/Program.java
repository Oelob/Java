package OOP.les01;



public class Program {
    
    public static void main(String[] args) {  
        
        Milk milk1 = new Milk("Happy Milkman", 5.5, 1, "бут", 1, 3.2, 2023, 03, 5);
        
        Masks mask = new Masks("CoolMask", 0.5, 5, "уп", 5);
        
        Lemonade cola = new Lemonade("Coca-Cola", 2.25, 1, "шт", 0.33);

        Bread bread = new Bread("Sandwich", 25, 1, "шт", 2023, 03, 10, "corn");

        Eggs eggs = new Eggs("Happy coco", 4.25, 1, "уп", 2023, 03, 25, 10);

        Diapers diapers = new Diapers("Huggies", 125, 1, "уп", 0, false, 2, 5, 2);
        
        Nipple nipple = new Nipple("Avent", 2.5, 1, "шт", 0, false);

        System.out.println(getInfo(cola));
        System.out.println(getInfo(mask));
        System.out.println(getInfo(milk1));
        System.out.println(getInfo(bread));
        System.out.println(getInfo(eggs));
        System.out.println(getInfo(diapers));
        System.out.println(getInfo(nipple));
    }

    public static String getInfo(Object product){
        String result = product.getClass().getSimpleName();
        result += product.toString();
        return result;
    }

    
    
    
}
