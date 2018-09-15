/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author esu
 */
public class SumOfTwoIntegers {
    static int n = 3;
    static Map<Integer,ArrayList> table = new Hashtable<>();
      
    
    public static void main(String[] args) {
        //build map of results
        for (int c = 0; c < n; c++) {
            for (int d = 0; d < n; d++) {
                int result = (int) (Math.pow(c,3) + Math.pow(d,3));
                //enter all results as keys, and pairs as values
                //'duplicates' will be added to the internal list 
                String pair = createKey(c,d);
                
                boolean test = table.containsKey(result);
                if(test){
                    //if values already exists
                    //get it and add new value
                    ArrayList values = table.get(result);
                    values.add(pair);
                }else{
                    //otherwise create new list
                    ArrayList<String> list = new ArrayList<>();
                    list.add(pair);
                    table.put(result, list);
                }
            }
        }
        
        Collection<Integer> keys = table.keySet();
        
        for(Integer k : keys){
            ArrayList values = table.get(k);
            if (values.size() > 1)
                System.out.println(k+" | "+values);
        }
        
    }
    
    
    static String createKey(int a, int b){
        String key = a + "-" + b;
        return key;
        
    }
}
