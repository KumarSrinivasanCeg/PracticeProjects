import java.util.ArrayList;
import java.util.Arrays;

class TwoSumIndices {
    public int[] twoSum(int[] nums, int target) {
        ArrayList <Integer> list = new ArrayList<>();


        for(int i=0; i < nums.length ; i++){
            for(int j=i+1; j <  nums.length; j++){
                if( nums[i] + nums [j] == target)
                {
                    list.add(i);
                    list.add(j);
                }
            }



        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
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