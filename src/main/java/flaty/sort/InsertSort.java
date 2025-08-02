package flaty.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author flatychen
 */
public class InsertSort extends AbstractSort {


    // 1 2 0 6 5
    //     x
    public void sort(int[] c) {
        int j = 0;
        for (int i = 0; i < c.length; i++) {
            int t = c[i];
            for (j = i; j >= 1 && c[j-1] > t; j--) {
                    c[j] = c[j - 1];
            }
            c[j] = t;
        }

    }


}
