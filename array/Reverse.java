//package Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 1, 4, 9 };
        System.out.println("Print Reverse");
        Reverse(arr);
    }

    static void Reverse(int a[]) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + "");
        }
    }
}
