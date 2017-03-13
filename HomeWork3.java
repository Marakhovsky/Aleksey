package homework3;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
      // Задание 1. Факториал
        Scanner in = new Scanner(System.in);
        System.out.print("Вычисление факториала числа: ");
        int n = in.nextInt();
        System.out.println("Факториал равен: " + factorial(n));

      // Задание 2. Возведение в степень
        System.out.print("Введите число: ");
        int x = in.nextInt();
        System.out.print("Введите степень числа: ");
        int y = in.nextInt();
        System.out.println("Результат: " + degree(x, y));

      // Задание 3. Чернобыльские зайцы
        System.out.print("Введите количество зайцев в ряду: ");
        int bannies = in.nextInt();
        System.out.println("Общее количество ушей: " + bunnyEars(bannies));

      // Задание 4. Сумма цифр числа
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.println("Сумма его цифр равна: " + sumDigits(number));
      
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static double degree(double x, int n) {
        if (n == 0) {
           return 1;
        }
        return n > 0 ? x * degree(x, n - 1) : 1/(x * degree(x, Math.abs(n) - 1));
    }

    public static int bunnyEars(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 == 0 ? 3 + bunnyEars(n - 1) : 2 + bunnyEars(n - 1);
    }

    public static int sumDigits(int n) {
        return n % 10 == n ? n : n % 10 + sumDigits(n / 10);
    }
    
}
