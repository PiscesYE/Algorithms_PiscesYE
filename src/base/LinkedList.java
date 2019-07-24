package base;

/**
 * Linked list - 链表
 * <p>
 * 基本核心为：
 * 数据以节点的形式存储，节点包括数据和引用(地址)
 * 节点与节点之间链接形成链表
 * <p>
 * 基本结构：
 * Node - 数据节点，如HashMap中包含Key & Value
 * Next - 指向下一个节点
 * Size - 记录当前节点数，从根节点开始计数
 * <p>
 * 链表的分类：
 * 单链表：每个节点包含数据和一个引用，指向下一节点
 * 双向链表：每个节点包含数据和两个引用，分别指向上下两节点
 * 单循环链表：每个节点包含数据和一个引用，尾节点的引用指向头节点或开始节点
 * 多重链的循环链表：将表中节点链在多个环上，其实我也没搞懂！
 * <p>
 * 优势：1.每个节点动态分配存储空间，避免了大片连续空间的分配
 * 2.删除节点时直接断开对删除节点的引用，交由GC释放
 * 劣势：数据访问时只能顺着链表查找，自由度和效率都存在一定的缺陷
 * <p>
 * Note：非线程安全
 * <p>
 * 设计上的问题：到底要不要存储重复的值，暂时允许存储重复的值
 *
 * @author PiscesYE
 */
public class LinkedList<T extends Object> {

    /**
     * 链表根节点
     * 节点数据可以为基本数据类型，自定义的类或其他
     * 使用泛型创建时设置节点数据类型
     */
    private Node root;
    private int size;

    /**
     * 链表构造函数
     * 初始化空链表，size = 0
     */
    public LinkedList() {
        root = null;
    }

    /**
     * 链表构造函数
     * 初始化链表并初始化根节点，size = 1
     *
     * @param data 根节点数据
     */
    public LinkedList(T data) {
        root = new Node(data);
        size++;
    }


    class Node {
        T node;
        Node next;

        Node(T data) {
            node = data;
        }

        @Override
        public boolean equals(Object obj) {
            if (node.equals(node)) {
                return true;
            }
            return false;
        }
    }

    //增

    /**
     * 在链表的尾部添加节点
     *
     * @param data 添加新节点的数据
     * @return true if successful | otherwise false
     */
    public boolean put(T data) {
        if (data == null) {
            System.out.println("新增节点数据不能为空");
            return false;
        }

        Node add = new Node(data);

        if (size == 0) {
            root = add;
            size++;
            return true;
        } else {
            Node end = root;
            for (int i = 1; i < size; i++) {
                end = end.next;
            }
            end.next = add;
            size++;
            return true;
        }
    }

    /**
     * 在指定的节点后添加新节点
     *
     * @param node 在该节点后添加
     * @param add  添加的新节点
     * @return
     */
    public boolean put(T node, T add) {
        if (node == null || add == null) {
            System.out.println("节点数据不能为空");
            return false;
        }

        if (size == 0) {
            System.out.println("当前链表为空");
            return false;
        }

        Node jump = root;
        for (int i = 1; i < size; i++) {
            if (jump.node == node && jump.node.equals(node)) {
                Node addNode = new Node(add);
                addNode.next = jump.next;
                jump.next = addNode;
                size++;
                return true;
            }
            jump = jump.next;
        }
        System.out.println("当前链表中未找到该节点");
        return false;
    }

    /**
     * 插入头节点
     *
     * @param data 插入节点数据
     * @return true if successful | otherwise false
     */
    public boolean putRoot(T data) {
        if (data == null) {
            System.out.println("节点数据不能为空");
            return false;
        }

        Node add = new Node(data);
        if (size == 0) {
            root = add;
            size++;
            return true;
        } else {
            add.next = root;
            root = add;
            size++;
            return true;
        }
    }

    //删

    /**
     * 移除指定节点数据的节点
     * 暂时允许存储重复的值，所以需要删除的节点可能不止一个
     *
     * 有问题，不能删除第一个节点
     *
     * @param data 需要删除包含该数据的节点
     * @return 删除结果
     */
    public boolean remove(T data) {
        if (data == null) {
            System.out.println("节点数据不能为空");
            return false;
        }

        if (size == 0) {
            System.out.println("当前链表为空");
            return false;
        }

        //TODO 有问题，不能删除第一个节点
        Node jump = root;
        Node parent = jump;
        boolean result = false;
        for (int i = 1; i < size; i++) {
            if (jump.node == data && jump.node.equals(data)) {
                if (--size == 0) {
                    root = null;
                } else {
                    parent.next = jump.next;
                }
                result = true;
            }
            parent = jump;
            jump = jump.next;
        }
        if (!result){
            System.out.println("当前链表未找到该节点");
        }
        return result;
    }

    //改

    //查

    /**
     * 链表是否为空
     *
     * @return true 空
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * 获取链表的长度
     * @return The number of linked list
     */
    public int size(){
        return size;
    }

    /**
     * 查询节点数据
     * 根据参数查找，但是我目前的节点没有查找的条件
     *
     * @param data
     * @return
     */
    public int get(T data) {
        if (data == null) {
            System.out.println("节点数据不能为空");
            return 0;
        }

        if (size == 0) {
            System.out.println("当前链表为空");
            return 0;
        } else {
            Node end = root;
            for (int i = 1; i < size; i++) {
                if (end.node == data && end.node.equals(data)) {
                    return i;
                }
            }
            System.out.println("链表中没有该节点数据");
            return 0;
        }
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (size > 0){
            Node jump = root;
            for (int i = 0; i < size; i++) {
                sb.append(jump.node.toString()+" -> ");
                jump = jump.next;
            }
        }
        sb.append("null");
        return sb.toString();
    }
}
