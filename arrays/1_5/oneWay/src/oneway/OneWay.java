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
        
        
        
    }
    
     
     //if same - deletion & addition are excluded
     //check if different by one char O(N) 
     
     //if different lengths
     //check if shorter one has all chars in longer one
     //if not - false
     //if yes, add or remove one
     

    
}
