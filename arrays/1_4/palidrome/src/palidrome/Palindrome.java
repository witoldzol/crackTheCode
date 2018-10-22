/*
given a string, check if its a permutation of a palindrome!!
-check if it can be a palindrome
 */

public class Palindrome {

    static int oddChar = 0;

    public static void main(String[] args) {
        String test = "tact coa";
        pali(test);
    }


    static void pali(String str){
        String trimmed = removeWhiteSpace(str);
        int len = trimmed.length();
        int[] countedChars = countedChars(trimmed);
        int numberOfNoPairs = countNoPairs(countedChars);
        boolean palidromePossible = checkIfPalindromePossible(len, numberOfNoPairs);
        char[] uniqueChars = getUniqueChars(countedChars, numberOfNoPairs);
        System.out.println("unique "+ new String(uniqueChars));
        String prefix = "";
        System.out.println("odd char is   " + (char) oddChar);
        String uniqueStr = new String(uniqueChars);
        System.out.println("len " + uniqueStr.length());
        permute(uniqueStr , prefix);


    }


    static void permute(String str, String prefix ) {
        //base case
        if( str.length() == 0 ) {
            System.out.println( buildPalidrome( prefix, oddChar ));
        }
        else
        {
            for (int i = 0; i < str.length(); i++) {
                String reminder = str.substring(0, i) + str.substring(i+1);
                permute(reminder, prefix + str.charAt(i));
            }
        }
    }
    
    
private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}

    private static String buildPalidrome(String prefix, int oddChar) {
        String reversed = reverseString(prefix);

        if ( oddChar == 0 ) {
            return prefix + reversed;
        }
        String temp = prefix + (char) oddChar;
        return temp + reversed;

    }

    private static String reverseString(String prefix) {
        char[] arr = prefix.toCharArray();
        char[] newArr = new char[arr.length];
        int index = 0;
        for (int i = arr.length-1; i >= 0 ; i--, index++) {
            newArr[index] = arr[i];
        }
        return new String(newArr);
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
    static int[] countedChars(String str){
        int[] arr = new int[128];
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i);
            System.out.println("char code "+c);
            arr[c]++;
        }
        return arr;
    }
    
    static int getArrLen(int[] arr){
        int count = 0;
        for(int i : arr){
            if(i != 0 )
                count++;
        }
        System.out.println("len of arr " + count);
        return count;
        
    }
    
    static boolean checkIfPalindromePossible(int strLen, int numberOfNoPairs){
        
        if(strLen % 2 == 0 && numberOfNoPairs == 0 ){
            return true;
        } else if( strLen % 2 != 0 && numberOfNoPairs == 1){
            return true;
        }
        return false;
    }

    private static char[] getUniqueChars(int[] arr, int noPairs) {
        int charLen = getArrLen(arr) - noPairs;
        char[] charArr = new char[charLen];
        int charIndex = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0)continue;
            if( arr[i]%2 ==0){
                charArr[charIndex] = (char) i;
                charIndex++;
            }
        }
        return charArr;
    }



    static int countNoPairs(int[] arr){

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            if (arr[i] % 2 != 0) {
                counter++;
                oddChar = i;
            }
        }
        return counter;
    }

}
