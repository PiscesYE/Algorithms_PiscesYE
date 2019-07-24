import base.LinkedList;
import base.SequentialList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> test = new LinkedList<>();
        test.put("第一个节点");
        test.put("球球");
        test.put("第一个节点","插入的节点");
        System.out.println(test.toString());
        System.out.println("当前节点数："+test.size());
        //test.remove("插入的节点");
        test.remove("第一个节点");
        System.out.println(test.toString());
        System.out.println("当前节点数："+test.size());
    }
}
