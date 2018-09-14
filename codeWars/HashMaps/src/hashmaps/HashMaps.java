/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author esu
 */
public class HashMaps {
    static Map<String, Integer> map = new HashMap<>();
        
    public static void main(String[] args) {
        map.put("a",0);
        map.put("a",1);
        map.put("a",2);
        
        
        if(map.containsKey("a")) System.out.println("yes a is present");
        System.out.println("-----------------------------");
        for(String s : map.keySet() ) System.out.println(s);
        System.out.println("-----------------------------");
        for(Integer i : map.values() ) System.out.println(i);
        System.out.println("-----------------------------");
        for(Map.Entry kv : map.entrySet() ) System.out.println("key value "+kv);
        System.out.println("-----------------------------");
        System.out.println("map size is " + map.size());
        System.out.println("-----------------------------");
        if(map.containsValue(Integer.bitCount(0)))System.out.println("yes value 1 is present");
    }
}
    
