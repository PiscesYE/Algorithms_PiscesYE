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
 *
 * @author PiscesYE
 */
public class LinkedList<T extends Object> {

    /**
     * 链表节点数据
     * 可以为基本数据类型，自定义的类或其他
     * 使用泛型创建时设置节点类型
     */
    private Node root;
    private int size;

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

    }

    //增
    public boolean putNode(T data) {
        if (data == null){
            System.out.println("新增节点不能为空");
            return false;
        }
        Node end = root;
        for (int i = 0; i < size - 1; i++) {
            end = end.next;
        }
        end.next = new Node(data);
        return true;
    }


    //删

    //改

    //查
}
