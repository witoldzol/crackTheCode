package src;

class RotateMatrix{
    
    void rotate(int[][] arr){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){
                rotatePixel(arr[i][j], 'l');
                
            }
        }
    }

    private int rotatePixel(int i, char direction) {
        return direction=='l' ? i<<8 : i>>8; 
    }
    
}