package Recursion;

public class numberToString{
    public static void convert(String[] str,String num,int idx){

        if(idx<=num.length()-1){
            int letter=Character.getNumericValue(num.charAt(idx));
            System.out.println(str[letter]);
        }
        if(idx==num.length()){
            return;
        }
        convert(str,num,idx+1);
    }
    public static void main(String args[]){
        String[] str= {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        String number="219";
        convert(str,number,0);
    }
}

/*
//public class Recursion.numberToString {
    public static void convert(String str,int idx){
        if(idx==str.length()){
            //System.out.print("");
            return;
        }
        switch(str.charAt(idx)){
            case '1':
                System.out.println("one");
                break;
            case '2':
                System.out.println("two");
                break;
            case '3':
                System.out.println("three");
                break;
            case '4':
                System.out.println("four");
                break;
            case '5':
                System.out.println("five");
                break;
            case '6':
                System.out.println("six");
                break;
            case '7':
                System.out.println("seven");
                break;
            case '8':
                System.out.println("eight");
                break;
            case '9':
                System.out.println("nine");
                break;
            case '0':
                System.out.println("zero");
                break;

        }
         //String cha=String.valueOf(str.charAt(idx));
         convert(str,idx+1);
    }
    public static void main(String[] args){
        convert("12292",0);
    }
}


*/
