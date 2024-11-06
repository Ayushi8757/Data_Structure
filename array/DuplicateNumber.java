
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 5, 4, 3, 4 };
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
