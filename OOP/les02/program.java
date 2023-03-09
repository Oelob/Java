import java.util.concurrent.BlockingQueue;

public class program {
    public static void main(String[] args) {
        // Cat murzik = new Cat(12, 5, "Blue", "Miauu", "Murzik", "Persian", true, null, 2020, 03, 21,false);
        // System.out.println(murzik);

        Dog tuzik = new Dog(500, 20, "green", "woof", "Tuzik", "scotch terrier", true, "black", 2020, 12, 30, false);
        System.out.println(tuzik);
        System.out.println("==============");
        tuzik.Training();
        System.out.println("==============");
        System.out.println(tuzik);
    }
}
