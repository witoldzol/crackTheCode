public class CharactersToNumbers{
    
    public static void main(String[] args) {
        int num = 1234;
        
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            System.out.println( Character.getNumericValue(str.charAt(i)));
        }
        
        //String.valueOf() == Integer.toString()
        
        //Character.getNumbericValue() == string.charAt() - '0'
}
}