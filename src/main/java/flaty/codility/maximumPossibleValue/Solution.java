package flaty.codility.maximumPossibleValue;

/**
 * class Solution:
 * """
 *
 * @author flaty
 * @return: returns the maximum possible value obtained by inserting one '5' digit
 * @date 2020-7-28
 */
public class Solution {

    public int solution(int N) {
        String s = String.valueOf(N);
        char arr[] = s.toCharArray();
        if (N >= 0) {
            for (int i = 0; i < arr.length; i++) {
                if ('5' > arr[i]) {
                    String temp = s.substring(0, i) + "5" + s.substring(i, arr.length);
                    return Integer.parseInt(temp);
                }
            }
        }else{
            for (int i = 1; i < arr.length; i++) {
                if ('5' < arr[i]) {
                    String temp = s.substring(0, i) + "5" + s.substring(i, arr.length );
                    return Integer.parseInt(temp);
                }
            }
        }
        return Integer.parseInt(N + "5");
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(268));
        System.out.println(new Solution().solution(670));
        System.out.println(new Solution().solution(0));
        System.out.println(new Solution().solution(-999));
    }

}

