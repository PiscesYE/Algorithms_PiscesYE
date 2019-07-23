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
 * 优势：
 * 劣势：
 * <p>
 * Note：非线程安全
 *
 * @author PiscesYE
 */
public class LinkedList<T extends Object>{

    private T node;
    private LinkedList<T> next;

    public LinkedList() {
    }

    public LinkedList(T node) {
        this.node = node;
    }
}
