/**
 * Created by mowenlong on 17/9/28.
 *
 * 19 / 19 test cases passed.
 * Runtime: 40 ms
 * Status: Accepted
 */

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int[] result = twoSum(nums, 6);
        if (result[0] == 1 && result[1] == 2) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        nums = new int[]{3, 3};
        result = twoSum(nums, 6);
        if (result[0] == 0 && result[1] == 1) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int ii = i + 1; ii < nums.length; ii++) {
                if (nums[i] + nums[ii] == target) {
                    return new int[]{i, ii};
                }
            }
        }
        return new int[]{};
    }
}
