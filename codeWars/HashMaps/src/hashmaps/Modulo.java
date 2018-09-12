/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

/**
 *
 * @author esu
 */
public class Modulo {
    static int i = 30;
    static int res = 0;
    
    public static void main(String[] args) {
        i %= 4;
        System.out.println("i equals " + i);
        res = res % 24;
        System.out.println("res is " + res);
    }
}
