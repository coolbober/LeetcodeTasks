import java.util.HashSet;
import java.util.Set;

/*
    Given a string, find the length of the longest substring without repeating characters.

    Example 1:
    Input: "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Example 2:
    Input: "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:
    Input: "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongetstSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() > 0) {
            Set<String> set = new HashSet<>();
            set.add(String.valueOf(s.charAt(0)));
            int size = 1;
            int max = 1;
            int frst = 0;
            for (int i = 1; i < s.length(); i++) {
                if(set.isEmpty())
                    frst = i;
                if (set.contains(String.valueOf(s.charAt(i)))) {
                    set.clear();
                    i = frst;
                    size = 0;
                } else {
                    set.add(String.valueOf(s.charAt(i)));
                    size++;
                }
                max = (max < size) ? size : max;
            }
            return max;
        } else
            return 0;
    }
}
