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
    
}