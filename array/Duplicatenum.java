import java.util.Arrays;

public class Duplicatenum {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i]; // Duplicate found
            }
        }
        return -1; // No duplicate found
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 3, 4, 5, 2 };
        System.out.println("Duplicate number is: " + findDuplicate(nums));
    }
}