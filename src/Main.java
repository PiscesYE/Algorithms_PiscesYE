import base.SequentialList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SequentialList<String> test = new SequentialList<>();
        test.SLAdd("你的");
        test.SLAdd("好的");
        test.SLInsert("插入节点", 2);
        test.SLAll();
        System.out.println("-----------------------");
        test.SLDelte(1);
        test.SLAll();
        System.out.println("-----------------------");
        test.SLInit();
        test.SLAll();
    }
}
