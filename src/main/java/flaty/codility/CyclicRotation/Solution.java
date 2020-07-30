package flaty.codility.CyclicRotation;

/**
 * class Solution:
 * """
 *
 * @author flaty
 * @return: returns the maximum possible value obtained by inserting one '5' digit
 * """
 * def MaximumPossibleValue(self, N):
 * # write your code here
 * if N >= 0:
 * num = str(N)
 * for i in range(len(num)):
 * if '5' > num[i]:
 * return int(num[:i] + '5' + num[i:])
 * <p>
 * else:
 * num = str(N)
 * for i in range(1, len(num)):
 * if '5' < num[i]:
 * return int(num[:i] + '5' + num[i:])
 * <p>
 * return int(num + '5')
 * @date 2020-7-28
 */
public class Solution {


    public int solution(int N) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(268));
        System.out.println(new Solution().solution(670));
        System.out.println(new Solution().solution(0));
        System.out.println(new Solution().solution(-999));
    }

}

