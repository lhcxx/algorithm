import java.util.Map;
import java.util.Vector;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    int longestConsecutive(Vector<Integer> nums) {
        HashMap<Integer,Boolean> used = new HashMap<>();
        for (Integer value : nums)
            used.put(value, Boolean.FALSE);
        int longest = 0;
        for (Integer i : nums) {
            if (used.get(i)) continue;
            int length = 1;
            used.put(i, Boolean.TRUE);
            for (int j = i + 1; used.containsKey(j); j++ ){
                used.put(j, Boolean.TRUE);
                ++length;
            }
            for (int j = i - 1; used.containsKey(j); j--) {
                used.put(j, Boolean.TRUE);
                ++length;
            }
            if (length > longest)
                longest = length;
        }
        return longest;
    }
}
