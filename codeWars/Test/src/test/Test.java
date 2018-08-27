/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author esu
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 20;
        int counter=0;
        for (int i=1; i<=n; i++)
            for(int j=1; j<=n;j++)
                for(int k=1;k<=n;k++)
                    for(int l=1;l<=n;l++){
                        if( (i==k && j==l)||(i==l && j==k)) continue;
                        if(Math.pow(i,3)+Math.pow(j,3) == Math.pow(k,3)+Math.pow(l,3))
                            
                            System.out.println(i + " + "+j + " = "+ k + " + " + l);
                            counter++;
                        }
        System.out.println(counter);                    
                            
    }
    
}
