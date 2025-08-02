package flaty.sort;

public class QuickSort extends AbstractSort {


    public void sort(int[] c) {
        this.sort(c, 0, c.length-1);
    }

    public void sort(int[] c, int start, int end) {
        if (start >= end) return;
        int x = this.partition(c, start, end);
        this.sort(c, start, x - 1);
        this.sort(c, x + 1, end);
    }
    private int partition(int[] c, int start, int end) {
        int mid = c[start], i = start, j = end;
        while (i < j) {
            while (c[j] >= mid && i < j) j--;
            while (c[i] <= mid && i < j) i++;
            if (i < j) super.swap(c, i, j);
        }
        System.out.printf("i="+i+" j="+j);
        System.out.println();
        super.swap(c, start, i);
        return j;
    }


}
