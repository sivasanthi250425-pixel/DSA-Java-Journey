import java.util.*;

public class Main {

    public static void leftRotate(int[] nums) {

        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {

            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        leftRotate(nums);

        System.out.println("After Left Rotation: " + Arrays.toString(nums));
    }
}
