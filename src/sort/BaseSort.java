package sort;

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
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

            }
        }
    }
}
