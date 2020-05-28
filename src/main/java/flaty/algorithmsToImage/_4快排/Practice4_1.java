package flaty.algorithmsToImage._4快排;

import java.util.Arrays;

/**
 * @author flaty-hp
 * @date 2020/5/28
 */
public class Practice4_1 {


    public int sum(int i, int a[]) {
        if (i == a.length - 1) {
            return a[i];
        }
        return a[i] + sum(++i, a);
    }

    public int sum(int a[]) {
        if (a.length == 1) {
            return a[0];
        }
        return a[0] + sum(Arrays.copyOfRange(a, 1, a.length ));
    }


    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
//        int array[] = {1,2};
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 1, array.length)));
        System.out.println(new Practice4_1().sum(0, array));
        System.out.println(new Practice4_1().sum(array));
    }

}

