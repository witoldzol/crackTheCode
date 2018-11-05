package src;

class Main{
    public static void main(String[] args) {
        RotateMatrix matrix = new RotateMatrix();
//        int[][] arr = {{1,2},{3,4}};
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        arr = matrix.rotate(arr,0,5);
        System.out.println("=======");
        matrix.printOut(arr);
    }
}