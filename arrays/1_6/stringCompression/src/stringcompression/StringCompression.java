/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcompression;

import java.util.ArrayList;

/**
 *
 * @author esu
 */
public class StringCompression {

    String compress(String str){
        int compressedLen = countCompressedLength(str);
        //check in advance if the compressed string will be shorter
        if (  compressedLen > str.length() ) return str;
        
        StringBuilder compressed = new StringBuilder(compressedLen);
        int counter = 0;
        char c = str.charAt(0);
        for( int i = 0; i<str.length(); i++){
            counter++;
            if( i+1 >= str.length() || str.charAt(i+1) != str.charAt(i)){
                compressed.append(str.charAt(i));
                compressed.append(counter);
                counter = 0;
            }
            //keep checking if we compressed str exceeds original string
            //if(compressed.length() > str.length() ) return str;
        }
        //return shorter string
        return compressed.length() > str.length() ? str : compressed.toString();
    }
    
    int countCompressedLength(String str){
        int finalLen = 0;
        int consequtive = 0;
        for( int i=0; i<str.length(); i++){
            consequtive++;
            if( i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                finalLen += ( 1 + Integer.toString(consequtive).length() );
                consequtive =0;
            }
        }
        return finalLen;
    }
}
