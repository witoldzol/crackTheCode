package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import jdk.nashorn.internal.objects.NativeArray;

class Main{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},{1,1,0,1},{1,1,1,1},{0,1,0,1},{1,1,1,1}};
        
        ZeroMatrix zm = new ZeroMatrix();

        zm.findZeros(matrix);    
        
    }
}