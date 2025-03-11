import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int n) {
        long rev = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num1 = sc.nextInt();
        int Rev = reverse(num1);
        System.out.println(Rev);
    }
}
