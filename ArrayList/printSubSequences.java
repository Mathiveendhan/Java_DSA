package ArrayList;
import java.util.ArrayList;

public class printSubSequences {
    static ArrayList <String> list = new ArrayList<>();
    public static void printsub(String str,String ans){
        if(str.length()==0){
            list.add(ans);
            return;
        }
        char ch=str.charAt(0);
        printsub(str.substring(1),ans+ch);
        printsub(str.substring(1),ans);

    }
    public static void main(String args[]){
        String str="abc";
        printsub(str,"");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
