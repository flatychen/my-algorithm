package flaty.codility.frogRiverOne;

import java.util.HashSet;
import java.util.Set;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {


    public int solution(int X, int[] A) {
        int sum = (1 + X) * X / 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(A[i])) {
                sum = sum - A[i];
            }
            if (sum == 0) {
                return i;
            }

            set.add(A[i]);
        }
        return -1;
    }

}

