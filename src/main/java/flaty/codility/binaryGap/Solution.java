package flaty.codility.binaryGap;

/**
 * @author flaty
 * @date 2020-7-28
 */
public class Solution {

    public int solution(int b) {
        int location[] = new int[128];
        int l = 0;
        for (int i = 0; b > 0; i++) {
            if ((b & 1) != 0) {
                location[l++] = i + 1;
            }
            b = b >>> 1;
        }
        int max = 0;
        for (int i = 1; i < l; i++) {
            max = Math.max(max,location[i]-location[i-1]);
        }
        return max;
    }

    public static void main(String[] args) {
        new Solution().solution(22);
    }

}

