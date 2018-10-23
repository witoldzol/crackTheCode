package palidrome;

public class Main{
    public static void main(String[] args) {
        Palidrome_Book p = new Palidrome_Book();
    
        String str = "aabba";

        boolean res = p.isPermutationOfPalidrome(str);
        System.out.println("res "+res);
        
    }
}