package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ZeroMatrix{
    //iterate over the whole matrix
    void findZeros(int[][] matrix){
        StringBuilder coordinates = new StringBuilder();
         
        Set<Integer> columns = new HashSet<>();
        boolean foundZero = false;
        //zero out rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( matrix[i][j] == 0 ) {
                    columns.add(j);
                    foundZero = true;
                }
                if( foundZero ) Arrays.fill(matrix[i], 0);
                foundZero = false;
            }
        }
        //zero out columns
        if( columns.size() > 0 ){
            for (Integer column : columns) {
                zeroColumns(matrix, column);
            }
            
        }
        printMatrix(matrix);
        
    }

    
    //iterate again zeroing all rows & columns

    private void zeroColumns(int[][] matrix, Integer column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            
        }
    }

}