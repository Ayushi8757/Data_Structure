public class InsertionSort {
    public static int[] Sort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int v = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > v) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = v;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 7, 12, 80, 2 };
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
