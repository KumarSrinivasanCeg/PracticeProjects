import java.util.ArrayList;
import java.util.HashMap;


public class SubarraySumEquals {


    public static int subarraySum(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> prefixSumCountMap = new HashMap<>();
        prefixSumCountMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            if(prefixSumCountMap.containsKey(prefixSum-k))

            {
                count +=  prefixSumCountMap.get(prefixSum-k);
            }
            prefixSumCountMap.put(prefixSum, prefixSumCountMap.getOrDefault(prefixSum,0)+1);
        }
        System.out.println(count);
        return count;

    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int nums [] = {1,2,1,3};
        int k = 1;

        subarraySum(nums,k);


    }
}
