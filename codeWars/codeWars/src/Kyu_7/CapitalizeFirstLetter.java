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
public class CapitalizeFirstLetter {
    
    public static String Jaden(String phrase ){
        
        char[] arr = phrase.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            
            if(i == 0 || arr[i-1] == ' '){
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        
        return new String(arr);
    }
    
    
    public static void main(String[] args) {
        String test = "i have no ide that i like avocados till i tried them";
        
        System.out.println(Jaden(test));
    
    }
}
