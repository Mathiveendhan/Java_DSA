package LeetCode_problem;//import java.util.*;
//
//public class LeetCode_problem.ransomeNote {
//    static HashMap<Character,Integer> hash=new HashMap<>();
//    public static boolean check(String str1,String str2){
//        for(int i=0;i<str1.length();i++){
//            char ch=str1.charAt(i);
//            if(!hash.containsKey(ch)){
//                hash.put(ch,1);
//            }else{
//                hash.put(ch,hash.get(ch)+1);
//            }
//        }
//        for(int j=0;j<str2.length();j++){
//           char chr=str2.charAt(j);
//           if(hash.containsKey(chr)){
//               hash.put(chr,hash.get(chr)-1);
//           }else{
//                   return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        String mag="happy and sad evening and lightly";
//        String note="help";
//        boolean ans=check(mag,note);
//        System.out.println(ans);
//    }
//}

// **** IMPORTANT ****
// KEEP THIS MAIN CLASS AT THE TOP WHEN COMPILING MULTIPLE CLASSES
// -------------------
import java.util.*;
public class ransomeNote {
    static HashMap<Character,Integer> hash=new HashMap<>();
    public static boolean check(String str1,String str2){
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(!hash.containsKey(ch)){
                hash.put(ch,1);
            }
            else{
                hash.put(ch,hash.get(ch)+1);
            }
        }
        for(int j=0;j<str1.length();j++){
            char ch1=str1.charAt(j);
            if(hash.containsKey(ch1)&& hash.get(ch1)>0){
                // System.out.println(hash);
                hash.put(ch1,hash.get(ch1)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean ans=check(str1,str2);
        System.out.println(ans);
    }
}
