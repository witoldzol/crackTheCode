import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String first = "aaabbb";
        String second = "bbbaaa";
        System.out.println("my solution");
        System.out.println(checkIfPermutations(first,second));
        System.out.println("==============");
        System.out.println("book -1 ");
        System.out.println(compare(first,second));
        System.out.println("==============");
        System.out.println("book -2");
        System.out.println(compareArrays(first,second));
        System.out.println("==============");


        /*
        QUESTIONS FOR INTERVIEWER:
        -should algo be CASE SENSITIVE?
        -is WHITE SPACE significant?


        1-check the lengths?
        2-run through the it and check indexes

        O(N2)

        S1 = "aabb"
        s2 = "abbb"
         */

    }
    //MY SOLUTION
    static boolean checkIfPermutations(String f, String s){
        if( f.length() != s.length()) return false;

        String temp =s;

        for (int i = 0; i < f.length(); i++) {
            char c = f.charAt(i);
            int index = temp.indexOf(c);
            if(index == -1 ) return false;
            temp = removeFromString(temp, index);
        }
        return true;
    }

    static String removeFromString(String str, int index){
        if(index == 0) return str.substring(1);
        else return str.substring(0,index).concat(str.substring(index+1,str.length()));
    }
    //BOOK SOLUTION
    static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    static boolean compare(String s, String b){
        if(s.length() != b.length() ) return false;
        return sort(s).equals(sort(b));
    }

    //SECOND BOOK SOLUTION
    //characters have their own char codes...so if we put them
    //all in array and count, we should get the same arrays
    static boolean compareArrays(String a, String b){
        //assuming ascii
        int[] numbers = new int[128];
        //string a
        char[] a_arr = a.toCharArray();
        //count occurances
        for( char c : a_arr ){
            numbers[c]++;
        }
        //decrement & check - if we are below 0 we have a mismatch
        for (int i = 0; i < b.length(); i++) {
            int c = (int) b.charAt(i);
            numbers[c]--;
            if(numbers[c] < 0) return false;
        }
        return true;
    }

}
