package src;

class Main{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},{1,1,0,1},{1,1,1,1},{0,1,1,1},{1,1,1,1}};
        
        ZeroMatrix zm = new ZeroMatrix();
        System.out.println( zm.findZeros(matrix) );
        
    }
}