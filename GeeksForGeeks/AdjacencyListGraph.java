package GeeksForGeeks;

import java.io.*;
import java.util.*;

public class AdjacencyListGraph {
        public List<List<Integer>> printGraph(int V, int edges[][]) {
            List<List<Integer>> largeList=new ArrayList<>();
            for(int i=0;i<V;i++){
                largeList.add(new ArrayList<>());
            }
            for(int[] n:edges){
                largeList.get(n[0]).add(n[1]);
                largeList.get(n[1]).add(n[0]);
            }
            return largeList;
        }
}

//input:
//        5 7
//        0 1
//        0 4
//        1 2
//        1 3
//        1 4
//        2 3
//        3 4
//
//Output:
//        1 4
//        0 2 3 4
//        1 3
//        1 2 4
//        0 1 3
