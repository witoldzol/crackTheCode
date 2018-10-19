
import java.util.Arrays;

public class BooleanArray{
    
    public static void main(String[] args) {
        //will print FALSE by default
        boolean[] arr = new boolean[128];
        Arrays.fill(arr, Boolean.TRUE);
        for(boolean b : arr){
            System.out.println(b);
        }
        
        int[] ar = new int[12];
        System.out.println(ar[3]);
    }
    
}