import java.util.Arrays;

public class EmptifyArrays {

    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int valid = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // Try both directions: right (+1) and left (-1)
                if (simulate(nums, i, 1)) valid++;
                if (simulate(nums, i, -1)) valid++;
            }
        }

        return valid;
    }

    private boolean simulate(int[] nums, int start, int direction) {
        int n = nums.length;
        int[] arr = nums.clone(); // make a copy
        int curr = start;
        int step = direction;

        while (curr >= 0 && curr < n) {
            if (arr[curr] == 0) {
                curr += step;
            } else {
                arr[curr]--;
                step = -step;
                curr += step;
            }
        }

        // Check if all elements became 0
        for (int val : arr) {
            if (val != 0) return false;
        }
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        EmptifyArrays vs = new EmptifyArrays();

        int[] nums1 = {1,0,2,0,3};
        System.out.println(vs.countValidSelections(nums1)); // Output: 2

        int[] nums2 = {2,3,4,0,4,1,0};
        System.out.println(vs.countValidSelections(nums2)); // Example test
    }
}


