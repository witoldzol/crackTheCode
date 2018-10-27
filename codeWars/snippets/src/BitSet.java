
class BitSet{
    
    public static void main(String[] args) {

        
        java.util.BitSet bs = new java.util.BitSet();
        
        System.out.println(bs.size());

        bs.set(0,true);
        System.out.println(bs.length());        
        for (int i = 0; i < 65; i++) {
            bs.set(i, true);
        }
        System.out.println("size now is " + bs.size());
        System.out.println(bs.length());
        

    }
}