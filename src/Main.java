import base.LinkedList;
import base.SequentialList;
import sort.BaseSort;
import theory.ProbabilityAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int array[] = {1,5,3,7,4,4,9,10};
        BaseSort.insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
