import java.util.Scanner;

public class GCD {
    public static int GCD(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else if (num2 > num1) {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        num2 = sc.nextInt();
        int gcd = GCD(num1, num2);
        System.out.println("GCD : " + gcd);
    }
}
