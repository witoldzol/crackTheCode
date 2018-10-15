import java.util.HashSet;
import java.util.Set;


//check if the string contains all unique characters
/*
1) Ask what character format we use : ascii , ascii extended or unicode
Ascii has 128/256 max chars, so if we exceed that number, we have duplictes
You can argue that time complexity is O(1) because there is a constant number
of elements ie. 128
 */

public class Unique {
    public static void main(String[] args) {

        String str = "abca%&*$a";

        //Very quick check
        ifAscii(str);
        //LONG WAY
        System.out.println(lookForDuplicate(str));

        //QUICK WAY
        Set set = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println("are there duplicates = "+ !(str.length() == set.size() ));

        //Book way
        System.out.println("--------boook--------");
        isUniqueChars(str);

        //weird way - book
        System.out.println("=========Boook 2");
        isUnique(str);
    }

    private static boolean ifAscii(String str) {
        if(str.length() > 128 ) return false;
        return true;
    }

    //recursive solution - linear recursion O(N)
    static boolean lookForDuplicate(String str){
        //base
        if(str.length() == 1) return false;
        if(str.indexOf(str.charAt(0),1) != -1) return true;
        System.out.println("substring : "+ str.substring(1));
        return lookForDuplicate(str.substring(1));
    }

    //book solution for ASCII (not extended)
    //if extended, increase numbers from 128 to 256
    static boolean isUniqueChars(String str){
        //if ascii
        if(str.length()>128) return false;

        boolean[] arr = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            System.out.println("value : " +value);
            System.out.println("value test + "+arr[value]);
            if ( arr[value] ) return false;
            arr[value]=true;
        }
        return true;
    }

    //if we assume that string uses only lower case letters
    static boolean isUnique(String str){
        int checker=0;
        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i) - 'a';

            System.out.println(" 1<< val :" + (1<<val) );
            if( (checker & (1 << val)) > 0) return false;
            System.out.println("checkere is "+checker);
            checker |= (1 << val);
            System.out.println("checker after "+checker);
        }
        return true;
    }
}
