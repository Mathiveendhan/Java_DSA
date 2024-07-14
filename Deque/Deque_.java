package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_ {
    public static void main(String args[]){
        Deque<Integer> d =new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        d.addFirst(0);
        d.addLast(3);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
    }
}
