/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esu
 */
public class SortedStrings {
    int numChars = 26;
    static int counter = 0;
    
    void printSortedStrings(int remaining){
        printSortedStrings(remaining, "");
    }
    
    void printSortedStrings(int remaining, String prefix){
        counter++;
        
        if(remaining == 0){
            if(isInOrder(prefix)){
                System.out.println(prefix);
            }
        }
        else{
            for(int i = 0; i<numChars; i++){
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }
    
    boolean isInOrder(String s){
        for(int i = 1; i<s.length(); i++){
            int prev = ithLetter(s.charAt(i-1));
            int curr = ithLetter(s.charAt(i));
            if(prev > curr){
                return false;
            }
        }
        return true;
    }
    char ithLetter(int i ){
        return (char) (((int) 'a') + i);
    }
    void getCounter(){
        System.out.println(counter);
    }
}
