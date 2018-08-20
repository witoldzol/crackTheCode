/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The time complexity is O(2toN) -- its bad!exponential growth
 * @author esu
 */
public class Fibonacci {
    static void allFib(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + fib(i));
        }
    }
    static int fib(int n){
        if(n == 0 ) return 0;
        else if(n == 1) return 1;
        
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        allFib(8);
                
    }
}
