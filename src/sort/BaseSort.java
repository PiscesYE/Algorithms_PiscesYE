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
     * Bubble Sort - 冒泡排序
     * 方式：大的往后放或者小的往前调（排序方向）
     * 当前：大的往后放
     * <p>
     * 实现：
     * 每次两两对比，把大的数字往后交换，再以下一位为基准向下对比
     * 每轮大循环能保证移动到最后的数字为最大值
     *
     * @param array 元数据
     */
    public static void bubbleSort(int array[]) {
        if (array == null) {
            System.out.println("待排序数组不能为空");
            return;
        }
        int size = array.length;
        if (size == 1) {
            return;
        }

        //排序
        for (int i = size - 1; i >= 0; i--) {
            int num = 0;
            for (int j = 1; j <= i; j++) {
                if (array[num] > array[j]) {
                    int cache = array[num];
                    array[num] = array[j];
                    array[j] = cache;
                }
                num++;
            }
        }
    }

    /**
     * Selection Sort - 选择排序
     * 选择未排序区域中最小的值和排序区的后一个交换
     * 查找最小值使用的是暴力查找，即一个个对比，待优化
     *
     * @param array 元数据
     */
    public static void selectionSort(int array[]) {
        if (array == null) {
            System.out.println("待排序数组不能为空");
            return;
        }

        int size = array.length;
        if (size == 1) {
            return;
        }

        //排序
        for (int i = 0; i < size; i++) {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int cache = array[i];
                array[i] = array[index];
                array[index] = cache;
            }
        }
    }

    /**
     * Insertion Sort - 插入排序
     * 实现：
     * 1.先讲前两个数据排序
     * 2.把第三个数据插入正确的位置
     * 。。。
     * <p>
     * 插入方法：类似顺序表移动节点，用覆盖的方式
     * <p>
     * 思想：不断的把一个数据插入有序的区域
     *
     * @param array 元数据
     */
    public static void insertionSort(int array[]) {
        if (array == null) {
            System.out.println("待排序数组不能为空");
            return;
        }

        int size = array.length;
        if (size == 1) {
            return;
        }

        //排序
        for (int i = 1; i < size; i++) {
            int index = i - 1;
            int cache = array[i];
            while (index >= 0 && cache < array[index]) {
                array[index + 1] = array[index];
                index--;
            }
            //找到比cache小的值或index == -1
            array[index + 1] = cache;
        }
    }

    /**
     * Shell Sort - 哈希排序或最小增量排序
     *
     * 思想：
     * 1.将n个数据分成n/2组，第1个数据和n/2+1个数据为一对
     * 2.一次循环使每个序列对排好顺序
     * 3.变为n/4个序列，再次排序
     * 。。。
     *
     * @param array 元数据
     */
    public static void shellSort(int array[]){

    }

}
