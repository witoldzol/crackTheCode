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
            if( i == 0 && j < n ) { j += goRight(); count++; }
            if( j == n && i < n ) { i += goDown(); count++; }
            if( i == n && j > 0 ) { j += goLeft(); count++; }
            if( i == 0 && j > 0 ) { i += goUp(); count++; }
        }
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("count "+count);
    }

    private int goRight() {
        return 1;
    }

    private int goDown() {
        return 1;
    }

    private int goLeft() {
        return -1;
    }

    private int goUp() {
        return -1;
    }
    
}