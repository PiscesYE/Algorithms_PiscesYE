import base.LinkedList;
import base.SequentialList;
import leetcode.find.Sum;
import sort.BaseSort;
import theory.ProbabilityAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int array[] = {1, 5, 3, 7, 4, 4, 9, 10};
        int re[] = Sum.twoSum(array, 10);
        for (int i : re) {
            System.out.println(i);
        }
    }
}
