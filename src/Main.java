import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 'x' для выражении y=3x+5: ");
        double x = scanner.nextDouble();
        System.out.println("Введите значение 'a' в выражении y=(a+b)/(a-b): ");
        double a = scanner.nextDouble();
        System.out.println("Введите значение 'b' в выражении y=(a+b)/(a-b): ");
        double b = scanner.nextDouble();
        System.out.println("Введите значение 'a' в выражении y=(ax/b)!: ");
        double a1 = scanner.nextDouble();
        System.out.println("Введите значение 'x' в выражении y=(ax/b)!: ");
        double x1 = scanner.nextDouble();
        System.out.println("Введите значение 'b' в выражении y=(ax/b)!: ");
        double b1 = scanner.nextDouble();
        Calc calc1 = new Calc();
        System.out.println(calc1.num1(x));
        Calc calc2 = new Calc();
        System.out.println(calc2.num2(a,b));
        Calc calc3 = new Calc();
        System.out.println(calc3.num3(a1,b1,x1));
    }
}
class Calc{
    public double num1(double x) {
        return 3 * x + 5;
    }

    public double num2(double a, double b) {
        if (a - b == 0) {
            System.out.println("Ошибка");
            return 0;
        }
        else
        {
            return (a + b) / (a - b);
        }
    }
    public double num3(double a1, double x1, double b1) {
        double result = 1;
        if (b1 != 0) {
            double fact = (a1 * x1 / b1);
            for (int i = 1; i <= fact; i++) {
                result *= i;
            }
        } else {
            System.out.println("Ошибка");
        }
        return result;
    }
}