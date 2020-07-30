package flaty.codility.permMissingElem;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution2 {
    public int solution(int[] a) {
        // write your code in Java SE 8
        long l = a.length;
        long sum = (l+1) * (l + 2) / 2;
        for (int i = 0; i < a.length; i++) {
            sum -= a[i];
        }
        return (int)sum;
    }

}

