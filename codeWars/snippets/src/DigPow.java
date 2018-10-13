class DigPow{
    
    public static void main(String[] args) {

        System.out.println(digPow(695,23));
        
    }
    public static long digPow(int n, int p){
        int total = calculateToPower(integerToArray(n), p);

        if(total%n != 0 ) return -1;
        else return total/n;        
    }
    
    public static int calculateToPower(int[] arr, int p) {
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total +=Math.pow(arr[i], p);
            p++;
        }
        return total;
    }
    
    public static int[] integerToArray(int n){
        String stringNumber = Integer.toString(n);
        int len = stringNumber.length();
        int[] arr = new int[len];
        //when char is being casted into integer, its converted to unicode number
        //so 0 = 48, therefore if we substract any number from 0 we will get the 
        //actual number as int (4 => 52 - 48 ==> 4)
        for (int i = 0; i < len; i++) {
            //arithmetics in java automatically cast to int
            arr[i] = stringNumber.charAt(i) - '0';
        }
        return arr;
    }
}
