package sb;

public class SBTest{
    
    public static void main(String[] args){
        SB builder = new SB();
        String a,b,c,d;
        a = "aaaa";
        b = "bbbb";
        c = "cccc";
        d = "dddd";
        
         builder.add(a);
         builder.add(b);
         builder.add(c);
         builder.add(d);
         System.out.println("size "+builder.getSize());
         String aa = builder.toString();
         System.out.println("rsult : "+aa);
    }
}