 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

import java.util.Arrays;

/**
 *
 * @author esu
 */
public class HashFunction {
    
    //variables
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;
    //main
    public static void main(String[] args) {
        
    }
    //constructor
    HashFunction(int size){        
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }
    //converts string values to integers, and puts those values into integer 
    //equal index
    public void simpleHashFunction(String[] stringsForArray, String[] theArray){
        for(int n=0; n < stringsForArray.length; n++){
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }
    
    public String findKey(String key){
        int arrayIndexHash = Integer.parseInt(key) % 29;
        while(theArray[arrayIndexHash] != "-1"){
            if(theArray[arrayIndexHash] == key){
                System.out.println(key + " was found in index " + arrayIndexHash);
            }
            //increment
            ++arrayIndexHash;
            //if we get to the end, return to index 0
            arrayIndexHash %= arraySize;
        }
        return null;
    }
    
}
