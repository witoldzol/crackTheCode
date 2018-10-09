public class ReferenceChange{
    public static void main(String[] args) {
        
        int a = 10;
        int b = a;
        
        a = 14;
        
        System.out.println(b);
        a = 0;
        System.out.println(b);
        
    }
}