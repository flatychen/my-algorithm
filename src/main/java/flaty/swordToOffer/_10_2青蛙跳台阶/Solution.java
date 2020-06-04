package flaty.swordToOffer._10_2青蛙跳台阶;

/**
 * @author flaty
 * @date 2020-5-30
 */
public class Solution {

    public int numWays(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return numWays(n - 1) + numWays(n-2);

    }

    public static void main(String[] args) {
        System.out.println(new Solution().numWays(7));;
    }

}

