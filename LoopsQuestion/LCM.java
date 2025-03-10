import java.util.Scanner;

public class LCM {
    public static int LCM(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = num1 * num2 / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        num2 = sc.nextInt();
        int lcm = LCM(num1, num2);
        System.out.println("LCM : " + lcm);
    }
}
