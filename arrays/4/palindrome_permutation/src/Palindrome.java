/*
given a string, check if its a permutation of a palindrome!!
-check if it can be a palindrome
 */

public class Palindrome {
    public static void main(String[] args) {
        String test = "  dddd aaa d";
        System.out.println(removeWhiteSpace(test));
    }

    static String removeWhiteSpace(String str){
        //count whitespace
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ') count++;
        }
        if(count==0) return str;
        int arrIndex = 0;
        char[] arr = new char[str.length()-count];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ') continue;
            arr[arrIndex]=str.charAt(i);
            arrIndex++;
        }
        return new String(arr);
    }

    boolean checkIfPalindromePossible(String str){

        int[] arr = new int[128];
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i);
            arr[c]++;
        }
        int numberOfNoPairs = countOddNumbersInArray(arr);

        if(str.length() % 2 == 0 && numberOfNoPairs == 0 ){
            return true;
        } else if( str.length() % 2 != 2 && numberOfNoPairs == 1){
            return true;
        }
        return false;
    }

    void findPalindrome(String str){
        if(str.length() == 0) System.out.println(str);
        else {

        }
    }

    int countOddNumbersInArray(int[] arr){
        int counter = 0;
        for( int i : arr){
            if (i == 0) continue;
            if(i%2!=0) counter++;
        }
        return counter;
    }
}
