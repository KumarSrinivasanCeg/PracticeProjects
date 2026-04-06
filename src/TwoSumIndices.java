import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class TwoSumIndices {
    //BruteForce Approach
    public int[] twoSum1(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }


        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
//optimized solution
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int complimentary = target - nums[i];

            if (map.containsKey(complimentary)) {
                return new int[]{map.get(complimentary), i};
            }

            map.put(nums[i], i);

        }

        return null;

    }

    //optimized solution for the value
    public int[] twoSumValue(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int complimentary = target - nums[i];

            if (map.containsKey(complimentary)) {
                return new int[]{complimentary, nums[i]};
            }

            map.put(nums[i], i);

        }

        return null;

    }


    // Example usage
    public static void main(String[] args) {
        TwoSumIndices vs = new TwoSumIndices();

        int[] nums1 = {2,7,11,15};
        int[] result = vs.twoSum(nums1,9);
        System.out.println(Arrays.toString(result));

        System.out.println(vs.twoSum(nums1,9).toString()); // Output: 2

        int[] nums2 = {3,2,4};
        System.out.println(vs.twoSum(nums2,6));

        int[] nums3 = {3,3};
        System.out.println(vs.twoSum(nums3,6)); // Example test
    }
}