public class majorityelement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int n = majority(arr);
        System.out.println(n);
    }

    public static int majority(int[] arr) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            int s = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    s++;
                    arr[j] = -1;
                }
            }
            if (s > arr.length / 2) {
                return arr[i];
            }
        }

        return -1;
    }
}
