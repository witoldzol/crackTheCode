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

        String s = "";
        int counter = 1;
        char c = str.charAt(0);
        for( int i = 1; i<str.length(); i++){

            if( c != str.charAt(i) ){
                
                s += c;
                s += counter;
                c = str.charAt(i);
                counter = 1;
            } else {
                counter++;
                //end of string case
                if( i == str.length()-1 ){
                    s += c;
                    s +=counter;
                }
            }
        }
        if(str.length() > s.length() ) return s;
        return str;
    }
}
