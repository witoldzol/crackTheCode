package src;

class Main{
    public static void main(String[] args) {
        RotateMatrix matrix = new RotateMatrix();
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        matrix.traverse(arr);
        System.out.println("=======");
        matrix.rotate(arr);
        System.out.println("=======");
        //matrix.traverse(arr);
        matrix.printOut(arr);
    }
}