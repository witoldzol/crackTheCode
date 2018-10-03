
import java.util.*;

public class TestStringBuilder{
    public static void main(String[] args) {
 
        long NANOSECOND_IN_MILLISECOND = 1000000;
        int ONE_MILLION = 100000;

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ONE_MILLION; i++) {
            sb.append(Integer.toString(i));
        }
        String test = sb.toString();

        System.out.println("StringBuilder Test ------------------------------------");
        System.out.println("Time elapsed: " + (System.nanoTime() - startTime) / NANOSECOND_IN_MILLISECOND + " milliseconds");

        startTime = System.nanoTime();

        String test2 = "";
        for (int i = 0; i < ONE_MILLION; i++) {
            test2 += i;
        }

        System.out.println("StringBuilder Test ------------------------------------");
        System.out.println("Time elapsed: " + (System.nanoTime() - startTime) / NANOSECOND_IN_MILLISECOND + " milliseconds");
    }
  
}