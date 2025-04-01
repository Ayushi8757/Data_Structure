public class SelectionSort {
    public static int[] SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 7, 12, 80, 2 };
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
