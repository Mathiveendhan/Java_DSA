package HashSet;
import java.util.HashSet;
import java.util.Set;

public class BasicFunction {
    public static void main(String[] args) {
        HashSet<Integer> hashElement = new HashSet<>();

        hashElement.add(0);
        hashElement.add(1);
        hashElement.add(2);
        hashElement.add(3);
        hashElement.add(0);
        hashElement.add(6);

        System.out.println("HashSet: " + hashElement);

        System.out.println(hashElement.contains(3));

        hashElement.remove(0);
        System.out.println("HashSet after removing: " + hashElement);

        System.out.println("Size of the HashSet: " + hashElement.size());

//        hashElement.clear();
//        System.out.println(hashElement);
    }
}