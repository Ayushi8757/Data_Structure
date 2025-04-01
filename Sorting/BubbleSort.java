public class BubbleSort {
    public static int[] BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 7, 12, 80, 2 };
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
