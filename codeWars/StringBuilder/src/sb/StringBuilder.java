package sb;

import java.util.ArrayList;


public class StringBuilder implements SBInterface {
    //converting char to Character is inefficient
    //use normal array for primitive types
//    ArrayList<Character> list;
  
    private char[] buffer;
    private int length;
    
    public StringBuilder(){
        list = new ArrayList();
    }
    //implement adding chars
    public void append(String word){
        int len = word.length();
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            list.add(c);
        }

    }
    public void insert(int start){
        
    }
    //implements getSize
    public int getSize(){
        return list.size();
    }
    //implements toString
    public String toString(){
        char[] arr = new char[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return new String(arr);
    }
    
    private int resize(){
        
    }
    
    private boolean overflow(){

    }
}