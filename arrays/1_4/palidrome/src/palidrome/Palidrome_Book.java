package palidrome;

class Palidrome_Book{

    public static void main(String[] args) {
        
        boolean res = isPermutationOfPalidrome("aabbx");
        System.out.println("res "+res);
    }
    boolean isPermutation(String str){
        int[] arr = new int[128];
        int odd = 0;
        for(char c : str.toCharArray()){
            if(c == ' ') continue;
            arr[c]++;
            if(arr[c] % 1 == 0) odd++;
            else odd--;
        }
        return odd <= 1;
    }
    
    // bit vector solution
    
    static boolean isPermutationOfPalidrome(String str){
        int bitVector = createBitVector(str);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

    static private int createBitVector(String str) {
        int bitVector = 0;
        for(char c : str.toCharArray()){
            int index = getCharNumber(c);
            bitVector = toggle(bitVector, index);
        }
        return bitVector;
    }

    static private int toggle(int bitVector, int index) {
        System.out.println("index "+index);
        //getCharNumber return -1 if char is outside of valid range
        if( index < 0 ) return bitVector;
        
        int mask = 1 << index;
        if( (bitVector & mask ) == 0){
            System.out.println("bv AND mask = 0");
            System.out.println("mask "+mask);
            System.out.println("bitVector "+bitVector);
            bitVector |= mask;
            System.out.println("bv after OR EQUEAL "+ bitVector);
        } else {
            System.out.println("bv AND mask not equal 0");
            bitVector &= mask;
        }
        return bitVector;
        
    }

    static private int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <=z){
            return val - a;
        }
        return -1;
    }

    static private boolean checkExactlyOneBitSet(int bitVector) {
        return ( bitVector & (bitVector - 1)) == 0;
    }
    
}