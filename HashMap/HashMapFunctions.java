package HashMap;
import java.util.*;

public class HashMapFunctions{
        public static void main(String[] args) {

            HashMap<String,Integer> hp = new HashMap<>();

            hp.put("one",1);
            hp.put( "two",2);
            hp.put( "three",3);
            hp.put( "four",4);
            hp.put( "five",5);
            hp.put( "six",6);

            System.out.println(hp);

            System.out.println(hp.get("one"));

            System.out.println(hp.containsKey("three"));

            hp.remove("one");

            System.out.println("after removed:"+hp);

            // Iterate through the HashMap
//            for (int number : hp.keySet()) {
//                String word = hp.get(number);
//                System.out.println(number + " is " + word);
//            }
        }
    }

