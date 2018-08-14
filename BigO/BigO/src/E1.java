/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esu
 */
public class E1 {
    
    public static void main(String[] args) {
    
        int[] arr = {1,2,3,4};
        
        reverseArray(arr);

    }
    // 1
    static void foo(int[] array){

    int sum = 0;
    int product = 1;
    for(int i =0; i < array.length; i++){
        sum += array[i];
    }
    for (int i = 0; i < array.length; i++){
        product *= array[i];
    }
    System.out.println( sum + ", " + product );
    System.out.println("============");
    }
    // 2
    static void printPairs(int[] array){
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println(array[i] + "," + array[j]);
            }
        }
        System.out.println("============");
    }
    // 3
    static void printUnorderedPairs(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                System.out.println(array[i] + "," + array[j]);
                System.out.println("============");
            }
        }
    }
    //4 
    static void reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            int end = arr.length -1 -i;
            arr[i] = arr[end];
            arr[end] = temp;
                    
        }
        for ( int ele : arr ){
            System.out.println(ele);
        }
    }
    
    
    
}





