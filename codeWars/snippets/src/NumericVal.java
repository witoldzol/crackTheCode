class NumericVal{
    public static void main(String[] args) {
        
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        
        System.out.println("a char " + a);
        System.out.println("z char " + z);
        
        System.out.println((int)a);
        System.out.println((int)z);
        
        int[] table = new int[Character.getNumericValue('z') -Character.getNumericValue('a') + 1];
        System.out.println("len "+table.length);

    }
    
    
}