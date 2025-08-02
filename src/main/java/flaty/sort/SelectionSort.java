package flaty.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author flatychen
 */
public class SelectionSort extends AbstractSort {

    public void sort(int[] c) {
        int minIndex = 0;
        for (int i = 0; i < c.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] < c[minIndex]) {
                    minIndex=j;
                }
            }
            super.swap(c, i, minIndex);
        }
    }


}
