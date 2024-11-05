import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        prime(n);
    }

    public static void prime(int n) {
        int temp = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Prime Number = " + n);
        } else {
            System.out.println("Not a prime Number");
        }
    }
}
