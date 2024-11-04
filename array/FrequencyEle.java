public class FrequencyEle {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 3, 1, 4, 6, 5 };
        Frequency(arr);
    }

    public static void Frequency(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;// skip the element already counted
            }
            int s = 1;// starts counting the current element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    s++;
                    arr[j] = -1;// mark as counted
                }
            }
            System.out.println(arr[i] + "= " + s);
            s = 0;
        }
    }
}
