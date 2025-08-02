package flaty.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public  class AbstractSort {


	public void sort(int[] c) {
	}
    protected void swap(int[] c, int i, int j) {
        int t = c[i];
        c[i] = c[j];
        c[j] = t;
    }

	@Test
	public void quickSortTest() {
		this.testEdgeCases(new QuickSort());
	}
	@Test
	public void insertSortTest() {
		this.testEdgeCases(new InsertSort());
	}
	@Test
	public void selectionSortTest() {
		this.testEdgeCases(new SelectionSort());
	}

    public void testEdgeCases(AbstractSort sort) {
        // 空数组
        testSort(new int[]{},sort);

        // 单元素数组
        testSort(new int[]{5},sort);

        // 已排序数组
        testSort(new int[]{1, 2, 3, 4, 5},sort);

        // 逆序数组
        testSort(new int[]{5, 4, 3, 2, 1},sort);

        // 全等数组
        testSort(new int[]{7, 7, 7, 7},sort);

        // 最小值边界
        testSort(new int[]{0, 1, 2},sort);
        testSort(new int[]{2,1},sort);
        testSort(new int[]{5, 1, 2},sort);
        testSort(new int[]{3, 1, 2},sort);
        testSort(new int[]{5, 1, 9, 3, 7,2},sort);

		int[] arr = new int[]{3, 1, 6, 7, 20, 6, 5, 4, 2};
		testSort(arr,sort);
		int[] arr2 = new int[]{5, 1, 9, 3, 7};
		testSort(arr2,sort);
		int[] arr3 = new int[]{2, 3, 1};
		testSort(arr3,sort);

        // 最大值边界
        testSort(new int[]{1, 2, Integer.MAX_VALUE},sort);
    }


    private void testSort(int[] arr,AbstractSort sort) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
		sort.sort(arr);
        assertArrayEquals(copy, arr);
    }

}
