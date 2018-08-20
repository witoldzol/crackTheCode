/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Time complexity of this algorithm is O(N)
 * because we solved and stored all previous solutions 
 * hence all we are doing is the N number of constant operations (retrieval and store)
 * @author esu
 */
public class FibonacciCache {
    
    static void allFib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ":" + fib(i, memo));
        }
}

    static int fib(int n, int[] memo) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (memo[n] > 0 ) return memo[n];

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);

        return memo[n];
    }

    public static void main(String[] args) {
        allFib(8);
    }
}

