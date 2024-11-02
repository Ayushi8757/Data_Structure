public class SwapAlternate {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 2, 5, 3, 7, 4, 8 };
        for (int i = 0; i < 6; i += 2) {
            if (i + 1 < 6) {
                arr[i] = arr[i] + arr[i + 1];
                arr[i + 1] = arr[i] - arr[i + 1];
                arr[i] = arr[i] - arr[i + 1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
