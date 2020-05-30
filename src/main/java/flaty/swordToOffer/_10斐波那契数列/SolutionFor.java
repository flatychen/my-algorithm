package flaty.swordToOffer._10斐波那契数列;

/**
 * @author flaty
 * @date 2020-5-30
 */
public class SolutionFor {

    public int fib(int n) {
        int n0 = 0, n1 = 1, fib = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            fib = (n0 + n1) % 1000000007;
            n0 = n1;
            n1 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int result = new SolutionFor().fib(2);
        System.out.println(result);
    }

}

