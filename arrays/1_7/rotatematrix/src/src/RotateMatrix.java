package src;

class RotateMatrix{
    void printOut(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            
        }
    }
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
    int[][] rotate(int[][] arr, int start, int end){
        System.out.println("start "+ start );
        System.out.println("end "+end);
        if(end-start == 1 || start == end) {
            System.out.println("no more inner squares");
            return arr;
        }
        
        //arr for temp 
        int[] temp = new int[end-1];
        
        int n = end-1;
        
        //left to right
        for(int i = start; i < n; i++){
            temp[i]=arr[start][i];
        }
        //top to bottom
        for (int j = start; j < n; j++) {
            int val = arr[j][n];
            arr[j][n] = temp[j];
            temp[j] = val;
        }
        int counter=0;
        //right to left
        for (int k = n; k > start; k--,counter++) {
            int val = arr[n][k];
            arr[n][k] = temp[counter];
            
            temp[counter]=val;
        }
        counter=0;
        //bottom to top
        for (int l = n; l > start; l--, counter++) {
            int val = arr[l][start];
            arr[l][start] = temp[counter];
            temp[counter] = val;
        }
        //left to right ( output only )
        for (int m = start; m < n ; m++) {
            arr[start][m] = temp[m];
        }
        
        rotate(arr, start+1,end-1);
        
        return arr;
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