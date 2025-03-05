import java.util.Scanner;

class SumOfNaturalNumber {
    public static void sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        System.out.println("Sum of Natural Number = " + s);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        sum(n);

        // Another way for natural number with its formula n*(n+1)/2
        System.out.println("Sum of Natural Num : ");
        System.out.println(n * (n + 1) / 2);
    }
}