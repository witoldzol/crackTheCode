/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kyu_7;

/**
 *
 * @author esu
 * Calculate when a town will reach specified population
 */
class Arge {
    
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        double temp = p0;
        
        while(temp<p){
            temp += temp * percent / 100 + aug;
            years++;
        }
        return years;
    }
    
    public static void main(String[] args) {
        int years = nbYear(1500, 5,100, 5000);
        System.out.println("it will take " + years + " years ");
    }
    
}