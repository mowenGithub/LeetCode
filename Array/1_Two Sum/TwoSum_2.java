import java.util.Map;
import java.util.HashMap;
/**
 * Created by mowenlong on 17/9/29.
 *
 * 19 / 19 test cases passed.
 * Runtime: 12 ms
 * Status: Accepted
 */

public class TwoSum_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
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
        Map<Integer, Integer> hNums = new HashMap<>();
        Map<Integer, Integer> backupSameNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hNums.containsKey(nums[i])) {
                hNums.put(nums[i], i);
            } else {
                backupSameNums.put(nums[i], i);
            }
        }

        if (target >= 0) {
            for (int num : hNums.keySet()) {
                int difference = target - num;
                if (difference != num && hNums.containsKey(difference)) {
                    return new int[]{hNums.get(num), hNums.get(difference)};
                }
                if (difference == num && backupSameNums.containsKey(difference)) {
                    return new int[]{hNums.get(num), backupSameNums.get(difference)};
                }
            }
        }
        if (target < 0) {
            for (int num : hNums.keySet()) {
                int difference = target - num;
                if (difference != num && hNums.containsKey(difference)) {
                    return new int[]{hNums.get(num), hNums.get(difference)};
                }
                if (difference == num && backupSameNums.containsKey(difference)) {
                    return new int[]{hNums.get(num), backupSameNums.get(difference)};
                }
            }
        }


        return new int[]{};
    }
}
