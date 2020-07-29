package flaty.codility.oddOccurrencesInArray;

import java.util.HashSet;
import java.util.Set;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {

    public int solution(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                set.remove(a[i]);
            }else{
                set.add(a[i]);
            }
        }

        for (Integer integer : set) {
            return integer;
        }
        return 0;
    }

}

