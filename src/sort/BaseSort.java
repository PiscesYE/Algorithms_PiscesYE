package sort;

import tool.Base;

/**
 * 基本排序算法
 * <p>
 * 基本排序算法对整形数据进行排序
 *
 * @author PiscesYE
 */
public class BaseSort {

    /**
     * 冒泡排序
     * 方式：大的往后放或者小的往前调（排序方向）
     * 当前：大的往后放
     *
     * @param array 元数据
     */
    public static void bubbleSort(int array[]) {
        if (array == null) {
            System.out.println("待排序数组不可为空");
            return;
        }
        int size = array.length;
        if (size == 1) {
            return;
        }

        //排序
        for (int i = array.length - 1; i >= 0; i--) {
            int num = 0;
            for (int j = 1; j <= i; j++) {
                if (array[num] > array[j]) {
                    int a = array[num];
                    array[num] = array[j];
                    array[j] = a;
                }
                num++;
            }
        }
    }

    /**
     * 选择排序
     * 选择未排序区域中最小的值和排序区的后一个交换
     *
     * @param array 元数据
     */
    public static void SelectionSort(int array[]) {

    }
}
