import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of  " + num + " is : " + fact);
    }
}
