import java.util.Scanner;

public class FibonnacciSeies {
    public static void Fibo(int n) {
        int f = 0, s = 1;
        System.out.print(f + " " + s);
        for (int i = 2; i <= n; i++) {
            int new1 = f + s;
            System.out.print(" " + new1);
            f = s;
            s = new1;
        }
    }

    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num1 = sc.nextInt();
        Fibo(num1);

    }
}
