package sem03_homework;


import java.util.Arrays;
import java.util.Random;

public class homework {
    public static void main(String[] args) {
        int[] randMassive = getMassive(10, 20);
        System.out.println(Arrays.toString(randMassive));
        

    }

    public static int[] getMassive(int length, int max) {
        Random r = new Random();
        int [] result = new int[length];
        for (int i = 0; i <length; i++){
            result[i] = r.nextInt(max)+1;
        }
        return result;
    }

    public static int[] sortedMassive(int[] array) {
        int[] result = new int[array.length];
        
        return result;
    }
        
}
 
