package flaty.codility.maxCounters;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int lastMaxNum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                result[A[i]-1] += 1;
            } else {
                lastMaxNum = A[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (result[i] < lastMaxNum) {
                result[i] = lastMaxNum;
            }
        }
        return result;
    }

}

