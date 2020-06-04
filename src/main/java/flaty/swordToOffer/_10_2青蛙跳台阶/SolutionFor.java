package flaty.swordToOffer._10_2青蛙跳台阶;

/**
 * @author flaty
 * @date 2020-5-30
 */
public class SolutionFor {

    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        int a = 0, b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a + b)%1000000007;
            a = b;
            b = sum;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(new SolutionFor().numWays(7));
        ;
    }

}

