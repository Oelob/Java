package sem03_homework;


import java.util.Arrays;
import java.util.Random;

public class homework {
    public static void main(String[] args) {
        int[] randMassive = getMassive(5, 20);
        System.out.println(Arrays.toString(randMassive));
        sortedMassive(randMassive);
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

    public static void sortedMassive(int[] array) {
        if (array.length > 1) {

        int midle = array.length/2;
        int[] left_massive = new int [midle];
        
        for (int i = 0; i < midle; i++){
            left_massive[i] = array[i];
        }
        
        int[] right_massive = new int [array.length-midle];
        for (int i = 0; i < right_massive.length; i++){
                right_massive[i] = array[i+midle];
        }
        sortedMassive(left_massive);
        sortedMassive(right_massive);
        
        int left_count = 0;
        int right_count = 0;
        
        for (int i = 0; i < array.length; i++) {
                if (right_count >= right_massive.length || (left_count < left_massive.length && left_massive[left_count] <= right_massive[right_count])) {
                    array[i] = left_massive[left_count];
                    left_count++;
                } else {
                    array[i] = right_massive[right_count];
                    right_count++;
                }
            
            }
        }  
    }
}
        
       


    
        

 
