/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kyu_7;

/**
 *
 * @author esu
 */
public class charsAndStrings {
    
    private static void toChars(String str){
        
        char[] chars = str.toCharArray();
        
        for(char ele : chars){
            System.out.println(ele);
        }
        //combines array of chars into a string 
        //AMAZING!
        String s = new String(chars);
        
        System.out.println(s);        
    }
    
    public static void main(String[] args) {
        
        toChars("hellow");
    }
}
