/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author esu
 */
public class SumOfTwoIntegers {
    static int n = 3;
    static Map table = new Hashtable();
      
    
    public static void main(String[] args) {
        //build map of results
        for (int c = 0; c < n; c++) {
            for (int d = 0; d < n; d++) {
                int result = (int) (Math.pow(c,3) + Math.pow(d,3));
                //enter all results as keys, and pairs as values
                //'duplicates' will be added to the internal list 
                String pair = createKey(c,d);
                boolean test = table.containsKey(result);
                if(test)
                    System.out.println("key "+ result+" already exists, overriding "+" value "+table.get(result)+" with new value "+pair);
                
                table.put(result, pair);
                
            }
        }
        Set<Integer> keys = table.keySet();
        Set<String> pairs = table.entrySet();
        
        for(Object s : table.values()){
            System.out.println(s);
        }
        
        boolean test = table.containsValue("0-1");
        System.out.println("test "+test);
    }
    
    static String createKey(int a, int b){
        String key = a + "-" + b;
        return key;
        
    }
}
