/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esu
 */

//gets value expressed as string and compares its binary and hex values
public class CompareBinToHex {
    
    public static void main(String[] args) {
        String binary = "01010011";
        String hex = "b";
        Methods m = new Methods();
        System.out.println("Are values equal ? " + m.compareBinToHex(binary,hex));
                
    }
}

class Methods{
    int convertFromBase(String number, int base) {
        if (base < 2 || (base > 10 && base != 16)) {
            return -1;
        }
        int value = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = digitToValue(number.charAt(i));
            if (digit < 0 || digit >= base) {
                return -1;
            }
            int exp = number.length() - 1 - i;
            value += digit * Math.pow(base, exp);
        }
        return value;
    }

    int digitToValue(char c) {
        return Character.getNumericValue(c);
    }

    boolean compareBinToHex(String binary, String hex) {
        int n1 = convertFromBase(binary, 2);
        System.out.println("value of binary " + n1);
        int n2 = convertFromBase(hex, 16);
        System.out.println("value of hex " + n2);
        if (n1 < 0 || n2 < 0) {
            return false;
        }
        return n1 == n2;
    }
}