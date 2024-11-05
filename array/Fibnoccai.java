import java.util.Scanner;

public class Fibnoccai {
    public static void main(String[] args) {
        int n, i = 0, j = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int s = i + j;
        System.out.print(i + "," + j + ",");
        for (int k = 3; k <= n; k++) {
            System.out.print(s + ",");
            i = j;
            j = s;
            s = i + j;
        }
    }
}
