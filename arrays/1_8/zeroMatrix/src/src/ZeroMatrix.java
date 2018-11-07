package src;

class ZeroMatrix{
    //iterate over the whole matrix
    String findZeros(int[][] matrix){
        StringBuilder coordinates = new StringBuilder();
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
                if( matrix[i][j] == 0 ) {
                    coordinates.append(i);
                    coordinates.append(j);
                }
                
            }
            
        }
        return coordinates.toString();
        
    }

    
    //iterate again zeroing all rows & columns
    
}