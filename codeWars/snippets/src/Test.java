/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esu
 */
public class Test {
    public static void main(String[] args) {
        //second class
        String s = "abcdefghijk";
        Second c = new Second();
        int len = c.strOperations(s);
        System.out.println("str len " + len);
        System.out.println("last char is "+ s.charAt(len-1));

        //does return statement breaks out of loop?
        int a = 5;
        //yes!
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if ( i == a) return;
        }
        //but because we used RETURN
        //below code is not getting executed!
        
        //second class
//        String s = "abcdefghijk";
//        Second c = new Second();
//        System.out.println("str len " + c.strOperations(s));
//        System.out.println("5?   " + c.returnFive() );
    }
}


//can we have two classes and how to use them
class Second {
    
    
    int strOperations(String s){
        int len = s.length();
        return len;
    }
    
}
