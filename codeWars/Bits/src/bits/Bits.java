/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bits;

/**
 *
 * @author esu
 */
public class Bits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bitVector =0;
        int index = 4;
        int mask = 1 << index;
        
        if( (bitVector & mask) == 0 ){
            System.out.println("equal 0");
            bitVector |= mask;
            System.out.println("vector now = " + bitVector);
        } else {
            System.out.println("not equal");
        }

    }
    
}
