package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ZeroMatrix{
    //iterate over the whole matrix
    void findZeros(int[][] matrix){
        
        Set<Integer> columns = new HashSet();
        Set<Integer> rows = new HashSet();

        //zero out rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( matrix[i][j] == 0 ) {
                    columns.add(j);
                    rows.add(i);
                }
            }
        }
        //zero out columns
        if( columns.size() > 0 ){
            for (Integer column : columns) {
                zeroColumns(matrix, column);
            }
            
        }
        //zero out rows
        if ( rows.size() > 0 ){
            for (Integer row : rows) {
                zeroRows(matrix, row);
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

    private void zeroRows(int[][] matrix, Integer row) {
        Arrays.fill(matrix[row], 0);
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