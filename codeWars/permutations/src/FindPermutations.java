
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esu
 */
public class FindPermutations {
    
    
    public static void main(String[] args) {
        String s = "abbc";
        String b = "cbabadcbbabbcbabaabccbabc";
    
        //crawl the string
        traverseString(s,b);        
    }
    
    static void traverseString(String a, String b){
        int counter = 0;
        for(int i=0; i<b.length()-3; i++){
            //check if current char is in string a
            char c = b.charAt(i);
            int test = a.indexOf(c);
            //skip this substring, as it doesn't contain required letter
            if(test<0) continue;
            //build substring
            String sub = b.substring(i, i+4);
            //check if remaining letters of substring are contained also
            if( containsAllLetters(a, sub) ){
                System.out.println(sub);
                counter++;
            }
        }
        System.out.println("Total : "+counter);
    }
    //checks if string a contains all letters present in string b
    static boolean containsAllLetters(String a, String b){
        String str = b;
        boolean result = true;
        for(int i = 0; i < a.length(); i++){
            char letter = a.charAt(i);
            int test = str.indexOf(letter);
            if(test<0) {result = false; break;}
            //if we find match, remove it
            else {str = str.substring(0,test)+str.substring(test+1,str.length());}
        }
        return result;
    }
    
}
