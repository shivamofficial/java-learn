import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int j : map.values()) {
            if (!set.add(j)) {
                return false;
            }
        }

        return true;
    }
}
