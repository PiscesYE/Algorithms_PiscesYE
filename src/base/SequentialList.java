package base;

/**
 * Sequential List - 线性表
 * <p>
 * 基本核心为：
 * 使用连续的内存存储相同类型的数据
 * 根据首地址以及偏移计算得到所有数据的位置
 * <p>
 * 基本结构：
 * List[] - 存放数据的数组
 * MaxLen - 最大节点数
 * ListLen - 记录线性表已存节点数量
 * <p>
 * 基本操作包含：增删改查
 * <p>
 * 优势：使用连续的内存地址，可以根据头节点和偏移量计算取值
 * 劣势：1.不能保证内存分配的成功；2.插入和删除节点都需要移动大量的数据
 * <p>
 * Note：非线程安全
 *
 * @author PiscesYE
 */
public class SequentialList<T extends Object> {

    private static final int MAXLEN = 100;

    private int size;

    /**
     * 可以为基本数据类型，或者自定义的类或其他
     * 如包含key和value的类
     * 为方便使用，数据存储从1开始
     */
    private T list[] = (T[]) new Object[MAXLEN + 1];

    public SequentialList() {
    }

    //增

    /**
     * 在顺序表size+1的位置添加节点
     *
     * @param data 新节点元素
     * @return true if successful | false otherwise
     */
    public boolean add(T data) {
        if (size >= MAXLEN) {
            System.out.println("顺序表已满！");
            return false;
        }

        list[++size] = data;
        return true;
    }

    /**
     * 往指定的位置插入新节点
     * 插入的位置需要在[1,size]之间
     * <p>
     * 插入节点规则：
     * 1.移动原节点：size -> n，每个节点移动至自身+1的位置
     * 2.n位置插入新节点，size++
     *
     * @param data 新节点元素
     * @param n    插入的位置，需要在[1,size]之间
     * @return true if successful | false otherwise
     */
    public boolean add(T data, int n) {
        int i;

        if (size >= MAXLEN) {
            System.out.println("顺序表已满，不能再插入节点！");
            return false;
        }

        if (n < 1 || n > size) {
            System.out.println("插入节点序号错误，不能插入该节点！");
            return false;
        }

        //移动节点
        for (i = size; i >= n; i--) {
            list[i + 1] = list[i];//后移
        }

        //插入节点
        list[n] = data;
        size++;
        return true;
    }

    //删

    /**
     * 移除指定位置的节点
     * <p>
     * 移除节点规则：
     * 1.移动原节点：n+1 -> size，每个节点移动至自身-1的位置
     * 2.size--
     *
     * @param n 待删除的节点位置
     * @return true if successful | false otherwise
     */
    public boolean remove(int n) {
        int i;

        if (n < 1 || n > size) {
            System.out.println("删除的节点位置不存在！");
            return false;
        }

        for (i = n + 1; i <= size; i++) {
            list[i - 1] = list[i];//前移
        }

        size--;
        return true;
    }

    /**
     * 移除所有节点
     */
    public void clear() {
        size = 0;
    }

    //改

    /**
     * 替换指定节点的数据
     *
     * @param data 替换新的数据
     * @param n    替换节点
     * @return null 如果替换节点异常 | 原数据，成功替换
     */
    public T set(T data, int n) {
        if (n < 1 || n > size) {
            System.out.println("替换的节点数异常！");
            return null;
        }

        T old = list[n];
        list[n] = data;
        return old;
    }

    /**
     * 返回顺序表的节点数
     *
     * @return 顺序表的节点数
     */
    public int size() {
        return size;
    }

    //查

    /**
     * 查询顺序表是否为空
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * 查找节点
     *
     * @param n 查找的节点
     * @return
     */
    public T contains(int n) {
        if (n < 1 || n > size) {
            System.out.println("查找的节点位置有误！");
            return null;
        }

        return list[n];
    }

    /**
     * 打印显示所有节点
     */
    public void all() {
        if (size == 0) {
            System.out.println("顺序表为空！");
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= size; i++) {
            sb.append(i + ":" + list[i] + "\n");
        }
        System.out.println(sb);
    }

    @Override
    public String toString() {
        if (size == 0) {
            System.out.println("顺序表为空！");
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= size; i++) {
            sb.append(i + ":" + list[i] + "\n");
        }
        return sb.toString();
    }
}
