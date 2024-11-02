public class MissingNumber {
    int Missingnum(int array[], int a) {
        int SumOfAll = (a * (a + 1))/2;
        int res = 0;
        for (int i = 0; i < a - 1; i++) {
            res = res + array[i];
        }
        return SumOfAll - res;
    }

    public static void main(String[] args) {
        int a = 10;
        int arr[] = { 6, 1, 2, 8, 3, 4, 7, 10, 8, 9 };
        MissingNumber obj = new MissingNumber();
        int result = obj.Missingnum(arr, a);
        System.out.println(result);
    }
}
