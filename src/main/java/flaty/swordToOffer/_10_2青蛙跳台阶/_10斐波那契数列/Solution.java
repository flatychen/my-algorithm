package flaty.swordToOffer._10_2青蛙跳台阶._10斐波那契数列;

/**
 * @author flaty
 * @date 2020-5-30
 */
public class Solution {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        int result = new Solution().fib(48);
        System.out.println(result);
    }
}

