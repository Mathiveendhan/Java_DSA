package ArrayList;
import java.util.ArrayList;

public class FiveFunctions {
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        ArrayList <String> list2=new ArrayList<>();

        System.out.println("Add elements in list:");
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println();

        System.out.println("get an element:");
        System.out.println(list.get(1));
        System.out.println();

        System.out.println("delete an element:");
        list.remove(0);
        System.out.println(list);
        System.out.println();

        System.out.println("Display the size of the list");
        System.out.println(list.size());
        System.out.println();

        System.out.println("check element 1 is in the list:");
        System.out.println(list.contains(1));
        System.out.println();

        System.out.println("display all elements");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



    }
}
