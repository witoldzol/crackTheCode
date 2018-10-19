class Print_Permutations{
    
    public static int count=0;
    
    public static void main(String[] args) {
   
        String a = "omg wth";
        String b= "why u like dis";
        
        addStrings(a,b);
    }
    
    
    //time complexity :
    //we call N! * N (loop) times
    //each call does O(N) work
    //O(N^2 * N!)
    static void perm(String str, String prefix){
        //base condition
        if(str.length()==0){
            //we call it n! times 
            System.out.println(prefix);
            count++;
        } else {
            //O(N)
            for (int i = 0; i < str.length(); i++) {
                //O(N) amount of work
                String reminder = str.substring(0, i) + str.substring(i+1);
                perm(reminder,prefix + str.charAt(i));
            }
        }
    }
    
    static void addStrings(String a, String b){
        System.out.println(a+b);
        System.out.println(a+b.charAt(2));
    }
}