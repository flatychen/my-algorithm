package flaty.codility.permCheck;

import java.util.HashSet;
import java.util.Set;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(i + 1)) {
                return 0;
            }
        }
        return 1;
    }

}

