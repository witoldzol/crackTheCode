package src;
public class StringRotation{
    public boolean isRotation (String s1, String s2){
        if( s1.length() != s2.length() ) return false;
        char firstChar = s1.charAt(0);
        
        //find occurances of first character in second string
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) == firstChar){
                String s = s2.substring(i);
                if ( checkSubstring(s2.substring(i),s1.substring(0,s.length())) ){
                    s += s2.substring(0,i);
                    if(s.equals(s1))return true;
                }
            }
        }
        return false;
        
    }

    private boolean checkSubstring(String substring, String substring0) {
        if(substring.equals(substring0)) return true;
        return false;
    }
    
    
}