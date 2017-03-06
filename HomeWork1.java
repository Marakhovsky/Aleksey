package homework1;
import java.io.*;
/**
 * @author Алексей
 */
public class HomeWork1 {
    public static void main(String[] args)
        throws NumberFormatException, IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите первое число: ");
		double x = Double.parseDouble(reader.readLine());
		System.out.print("Введите второе число: ");
		double y = Double.parseDouble(reader.readLine());
		//double result = ((double)x + (double)y)/2;
		System.out.println("Математические операции: ");
                System.out.println("Сумма чисел: " + sum(x,y));
                System.out.println("Разность чисел: " + sub(x,y));
                System.out.println("Произведение чисел: " + mult(x,y));
                System.out.println("Частное чисел: " + div(x,y));
                System.out.println("Среднее арифметическое: " + aver(x,y));
              
    }
    
    private static double sum (double x, double y){
        return x+y;
    }
    private static double sub (double x, double y){
        return x-y;
    }
    private static double mult (double x, double y){
        return x*y;
    }
    private static double div (double x, double y){
        return x/y;
    }
    private static double aver (double x, double y){
        return (x+y)/2;
    }
}