import java.util.ArrayList;
import java.util.Arrays;

public  class RemoveElementFromArray {
    public int removeElement(int[] nums, int val) {
        Arrays.stream(nums).sorted();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
                j++;
            }
        }
        System.out.println(list);
        return list.size();

    }

    // Example usage
    public static void main(String[] args) {
        RemoveElementFromArray vs = new RemoveElementFromArray();

        int[] nums1 = {3,2,2,3};
        System.out.println(vs.removeElement(nums1,3)); // Output: 2

        int[] nums2 = {0,1,2,2,3,0,4,2};
        System.out.println(vs.removeElement(nums2,2)); // Example test
    }
}
