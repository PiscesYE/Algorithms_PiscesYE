package leetcode.find;

import java.util.HashMap;
import java.util.Map;

public class Sum {

    /**
     * Given an array of integers,return indices of
     * the two numbers such that they add up to a specific target.
     * <p>
     * 从给定的源数组中找出相加等于target的两个数，返回其数组下标
     * <p>
     * example：
     * [1,2,4,6] , target = 6
     * return [1,2]
     * <p>
     * Note：
     * 外层循环用于顺序选择判断的数据
     * 内层循环需要根据目标数据判断是否存在答案，
     * 而HashMap查找数据方面的性能在Java中是非常高的，可以根据数据量合理利用
     *
     * @param nums   Source array
     * @param target the goal of adding two numbers
     * @return
     */
    public static int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    public boolean checkParam(int[]... target) {
        for (int[] a : target) {
            if (a == null || a.length == 0) {
                return false;
            }
        }
        return true;
    }
}
