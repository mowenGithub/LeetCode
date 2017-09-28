public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int[] result = twoSum(nums, 6);
        if (result[0] == 1 && result[1] == 2) {
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
