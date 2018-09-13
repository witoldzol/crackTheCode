/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

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
    static int n = 100;
    static Map table = new Hashtable(n*n);
      
    
    public static void main(String[] args) {
        
        for (int c = 0; c < n; c++) {
            for (int d = 0; d < n; d++) {
                int result = (int) (Math.pow(c,3) + Math.pow(d,3));
                //enter all results as keys, and pairs as values
                //'duplicates' will be added to the internal list 
                table.put(result, createKey(c,d));
            }
        }
            
        //now iterate over the results that have more than one value
        Set<Integer> keys = table.keySet();
        Iterator<Integer> itr = keys.iterator();
        
        while(itr.hasNext()){
            if()
            int key = itr.next();
            
            System.out.println("Key "+key+" \nValue: "+table.get(key) );
        }
        
    }
    
    static String createKey(int a, int b){
        String key = a + "-" + b;
        return key;
        
    }
}
