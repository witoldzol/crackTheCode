/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kyu_7;

/**
 *
 * @author esu
 */
public class DnaStrand {
  public static String makeComplement(String dna) {
    //Your code
    StringBuffer newDna = new StringBuffer("");
    
    for(int i=0; i<dna.length(); i++){
      char c = dna.charAt(i);
      
      switch(Character.toUpperCase(c) ){
        case 'A':
        newDna.append('T');
        break;
        case 'T':
        newDna.append('A');
        break;
        case 'C':
        newDna.append('G');
        break;
        case 'G':
        newDna.append('C');
        break;
        default:
        newDna.append(c);
      }
      
    }
    return newDna.toString();
  }
  
    public static void main(String[] args) {
        String dna = "TAACG";
        System.out.println(makeComplement(dna));
    }
}
