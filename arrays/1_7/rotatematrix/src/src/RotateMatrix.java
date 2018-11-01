package src;

class RotateMatrix{
    
    void rotate(int[][] arr){

        
    }

    //traverse square in "rings"
    //with each tick calc the position
    void traverse(int[][] arr, int n, int[] temp){
        //base condition
        if(n <= 1) return;
        //arr for temp 
        
        //left to right
        for(int i = 0; i < n; i++){
            temp[i]=arr[arr.length -n ][i];
            
        }
        //top to bottom
        
        //right to left
        
        //bottom to top
        
    }
    
    void calculatePosition( int i, int j, int size){
        
        int n = size-1;
        int count =0;
        
        while( count < n ){    
            //go right
            while ( count < n ){
                //right
                if( i == 0 && j < n ) { j++; count++; } 
                //down
                else if( j == n && i < n ) { i++; count++; } 
                //left
                else if( i == n && j > 0 ) { j--; count++; }                
                //up
                else if( j == 0 && n > 0 ) { i--; count++; }                
            }
            
        }
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("count "+count);
        
    }

}