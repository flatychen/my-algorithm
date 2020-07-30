package flaty.codility.tapeEquilibrium;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {

    public int solution(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int prefixSum = 0, suffixeSum = 0;
        int minDifference = 0;
        for (int i = 0; i < a.length-1; i++) {
            prefixSum += a[i];
            suffixeSum = sum - prefixSum;
            int temp = Math.abs(prefixSum - suffixeSum);
            if (i == 0) {
                minDifference = temp;
            }
            minDifference = Math.min(temp, minDifference);
        }

        return minDifference;
    }


    public static void main(String[] args) {
        int a[] = {-1000, 1000};
        System.out.println(new Solution().solution(a));;
    }
}

