package sb;

import java.util.ArrayList;


public class SB implements SBInterface {
    //array to store our characters
    ArrayList<Character> list;
    
    public SB(){
        list = new ArrayList();
    }
    //implement adding chars
    public void add(String word){
        int len = word.length();
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            list.add(c);
        }

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
    
}