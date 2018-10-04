package sb;

public class SBTest{
    
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        String a,b,c,d;
        a = "aaaa";
        b = "bbbbkdjalkfdjldkaf";
        c = "cccjkfdklfdjfdlkjdfc";
        d = "dddkdldldldldldldldldldkfjalkjf;klajf;alkjf;aslkjfa;lkfj;akljf;falkjfdad";
        
         builder.append(a);
         builder.append(b);
         builder.append(c);
         builder.append(d);

         String aa = builder.toString();
         System.out.println(aa);
    }
}