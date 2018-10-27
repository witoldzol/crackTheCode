package src;

class RotateMatrix{
    
    void rotate(int[][] arr){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){
                rotatePixel(arr[i][j]);
                
            }
        }
    }

    private int rotatePixel(int i) {
        return i<<8;
    }
    
}