import base.LinkedList;
import base.SequentialList;
import theory.ProbabilityAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        for (int i = 10000000; i <= 10000030; i++) {
            System.out.println(ProbabilityAlgorithm.MontePI(i));
        }
    }
}
