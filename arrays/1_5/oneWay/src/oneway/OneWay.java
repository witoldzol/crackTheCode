/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneway;

/**
 *
 * @author esu
 */
public class OneWay {
    
    int lenDifference(String a , String b){
        int lenA = a.length();
        int lenB = b.length();
        int result = lenA > lenB ? lenA-lenB : lenB-lenA;
        return result;
    }
    
    boolean oneAway(String a , String b){
        int lenDiff = lenDifference(a, b);
        if( lenDiff > 1 ) return false;
        int counter = 0;
        //different lenghts
        if( lenDiff == 1){
            System.out.println("different len");
            String shorter, longer;
            int longerIndex =0;
            if( a.length() > b.length() ){
                longer = a;
                shorter = b;
            } else {
                longer = b;
                shorter = a;
            }
            for(int i =0; i<shorter.length(); i++, longerIndex++){
                if( shorter.charAt(i) == longer.charAt(longerIndex) ) continue;
                longerIndex++;
                counter++;
                if( counter > 1 ) return false;
            }
            //strings equal
        } else {
            System.out.println("same len");
            for(int i = 0; i< a.length(); i++){
                if(a.charAt(i)==b.charAt(i)) continue;
                counter++;
                if( counter>1 ) return false;
            }
        }
        return true;
    }
    
    boolean oneAway_book(String a, String b){
        //check the len difference
        //Math.abs - > absolute value, always returns positive 
        int lenA = a.length();
        int lenB = b.length();
        if( Math.abs( lenA-lenB)>1) return false;
        
        if( lenA == lenB ) return compareEqual(a,b);
        else if( lenA -1 == lenB) return compare(a,b);
        else if( lenA + 1 == lenB) return compare(b,a);
        
        return false;
    }

    private boolean compareEqual(String a, String b) {
        boolean foundDifference = false;
        for( int i = 0; i<a.length(); i++){
            if(a.charAt(i)!=b.charAt(i)){
                if(foundDifference) return false;
                foundDifference = true;
            }
        }
        return true;
    }
    //strring a is shorter one
    private boolean compare(String a, String b) {
        int shortIndex = 0;
        int longIndex = 0;
        boolean foundDifference = false;
        while(shortIndex < a.length() && longIndex < b.length()){
            if(a.charAt(shortIndex) != b.charAt(longIndex)){
                if(foundDifference) return false;
                foundDifference = true;
                longIndex++;
            }
            shortIndex++;
            longIndex++;
        }
        return true;
    }
    
}
