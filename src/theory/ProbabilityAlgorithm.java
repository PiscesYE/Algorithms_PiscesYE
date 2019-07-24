package theory;

/**
 * 概率算法思想
 * <p>
 * 执行过程：
 * 1.将问题转化为相应的几何图形，问题的结果对应几何图形的部分面积
 * 2.向集合图形中随机撒点
 * 3.统计总面积和结果面积中的点数，根据关系计算结果
 * 4.判断精度，调参
 * <p>
 * 大致分为4种形式：
 * 数值概率算法
 * Monte Carlo - 蒙特卡罗算法
 * Las Vegas - 拉斯维加斯算法
 * Sherwood - 舍伍德算法
 *
 * @author PiscesYE
 */
public class ProbabilityAlgorithm {

    /**
     * Monte Carlo - 蒙特卡罗算法
     * <p>
     * 使用蒙特卡罗算法计算圆周率
     * <p>
     * 圆的面积计算公式为：S = PI * r*r
     * <p>
     * 基本思想：
     * 1.以半径为1的圆心为原点建立笛卡尔坐标系
     * 2.取X，Y轴[0，1]正方形区域作为总面积
     * 3.以总面积内距圆心距离为一的区域为结果面积（四分之一个圆）
     * 4.撒点，根据面积点数结合圆面积点数计算结果
     * <p>
     * 本质：公式 -> PI
     *
     * @param n 撒点数，影响结果精度,需要庞大的点数才能获取精确的近似值
     * @return Monte Carlo - 蒙特卡罗算法计算的PI
     */
    public static double MontePI(int n) {
        double PI;
        double x, y;
        int sum = 0;
        //撒点
        for (int i = 0; i < n; i++) {
            x = Math.random();
            y = Math.random();
            //统计
            if (x * x + y * y <= 1) {
                sum++;
            }
        }
        //面积公式计算PI
        PI = 4.0 * sum / n;
        return PI;
    }
}
