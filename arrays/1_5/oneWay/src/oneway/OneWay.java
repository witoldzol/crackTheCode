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
                if( shorter.charAt(i) != longer.charAt(longerIndex)) return false;
                counter++;
                if(counter > 1 ) return false;
            }
            //strings equal
        } else {
            System.out.println("same len");
            for(int i = 0; i< a.length(); i++){
                if(a.charAt(i)==b.charAt(i)) continue;
                if(a.charAt(i+1) == b.charAt(i) && b.charAt(i+1)==a.charAt(i)){
                    counter++;
                    if(counter>1) return false;
                } else if(a.charAt(i+1) == b.charAt(i+1)){
                    counter++;
                    if(counter> 1) return false;
                }
                return false;
            }
        }
        return true;
    }
    
     
     //if same - deletion & addition are excluded
     //check if different by one char O(N) 
     
     //if different lengths
     //check if shorter one has all chars in longer one
     //if not - false
     //if yes, add or remove one
     

    
}
