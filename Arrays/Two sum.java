import java.util.*;

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remaining = target - nums[i];

            if (map.containsKey(remaining)) {
                return new int[] {map.get(remaining), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {4, 6, 2, 7};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
