package src;

class RotateMatrix{
    
    void traverse(int[][] arr){
        //left to right
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[0][i]);
        }
        //top to bottom
        for (int j = 1; j < arr.length; j++) {
            System.out.println(arr[j][arr.length-1]);
        }
        //right to left
        for (int k = arr.length-2; k >= 0; k--) {
            System.out.println(arr[arr.length-1][k]);
        }

        //bottom to top
        for (int l = arr.length-2; l >= 0; l--) {
            System.out.println(arr[l][0]);
        }
        
    }

    //traverse square in "rings"
    //with each tick calc the position
    void rotate(int[][] arr){
        int[] temp = new int[arr.length];
        int counter=0;
        //base condition
        if(arr.length <= 1) return;
        //arr for temp 
        
        //left to right
        for(int i = 0; i < arr.length; i++){
            temp[i]=arr[0][i];
        }
        //top to bottom
        for (int j = 0; j < arr.length; j++) {
            int val = arr[j][0];
            arr[j][0] = temp[j];
            temp[j] = val;
        }
        //right to left
        for (int k = arr.length-1; k >= 0; k--,counter++) {
            int val = arr[arr.length-1][k];
            arr[arr.length-1][k] = temp[counter];
            temp[counter]=val;
        }
        counter=0;
        //bottom to top
        for (int l = arr.length-1; l <= 0; l--, counter++) {
            int val = arr[l][0];
            arr[l][0] = temp[counter];
            temp[counter] = val;
        }
        counter=0;
        //left to right ( output only )
        for (int m = 0; m < temp.length; m++, counter++) {
            arr[0][m] = temp[counter];
        }
    }
    
    void leftToRight(int[][] arr){
        
    }
    
    void calculatePosition( int i, int j, int size, int start){
        
        int end = size-1;
        int count =0;
        
        while( count < end ){    
            //go right
            while ( count < end ){
                //right
                if( i == start && j < end ) { j++; count++; } 
                //down
                else if( j == end && i < end ) { i++; count++; } 
                //left
                else if( i == end && j > start ) { j--; count++; }                
                //up
                else if( j == start && end > start ) { i--; count++; }                
            }
            
        }
      
        
    }

}