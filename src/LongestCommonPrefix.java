import java.util.Arrays;

import static java.lang.Math.min;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix vs = new LongestCommonPrefix();

        String[] testCase1 = {"flower", "flow", "flight"};
        String[] testCase2 = {"dog", "racecar", "car"};
        String result = vs.longestCommonPrefix(testCase1);
        String result2 = vs.longestCommonPrefix(testCase2);
        System.out.println("result  :  " + result);
        System.out.println("result2 : " + result2);

    }

    public String longestCommonPrefix(String[] strs) {
        String longest = "";


        Arrays.sort(strs);

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < (min(strs[0].length(), strs[1].length())); j++) {

                if (strs[0].charAt(i) == strs[1].charAt(j)) {

                    longest = longest + strs[0].charAt(i);
                }

            }
        }
        return (longest.isEmpty()) ? "" : longest.trim();

    }

}