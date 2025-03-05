import java.util.Scanner;

public class PrimeNumber {
    public static void prime(int n) {
        int temp = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                temp++;

            }

        }
        if (temp > 1) {
            System.out.println("not prime");
        }
        System.out.println(" prime");
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        prime(n);
    }
}
