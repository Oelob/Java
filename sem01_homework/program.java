package sem01_homework;
import java.util.Scanner;

public class program {

    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] arg) {
        // Написать программу вычисления n-ого треугольного числа.
        // T_{n}={\frac {1}{2}}n(n+1),\;n=1,2,3
        int UserNumber = GetNumber();
        int triangualnumber = TrianNumber(UserNumber);
        System.out.println(Result(triangualnumber));
    }
    
    // модуль ввода данных
    public static int GetNumber() {
        System.out.println("Введите целое число: ");
        int number = input.nextInt();
        
        return number;
    }
    
    // модуль расчета треугольного числа 
    
    public static int TrianNumber (int number) {
        int res = (number*(number + 1))/2;
        return res;
    }
    
    // модуль формирования строки для вывода результата
    
    public static String Result(int trnum) {
        String result = "Треугольное число введенного вами значения = "+ trnum;
        return result;
    }

}
